package com.leodev.financescontrol.application.services.consolidated;

import com.leodev.financescontrol.adapter.out.IncomeRepository;
import com.leodev.financescontrol.adapter.out.OutcomeRepository;
import com.leodev.financescontrol.application.domain.consolidated.CONSOLIDATED_MONTHLY_STATUS;
import com.leodev.financescontrol.application.domain.consolidated.Consolidated;
import com.leodev.financescontrol.application.domain.consolidated.ConsolidatedResponse;
import com.leodev.financescontrol.application.domain.income.Income;
import com.leodev.financescontrol.application.domain.outcome.Outcome;
import com.leodev.financescontrol.application.port.in.ConsolidatedUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ConsolidatedService implements ConsolidatedUseCase {

    @Autowired
    OutcomeRepository outcomeRepository;

    @Autowired
    IncomeRepository incomeRepository;

    @Override
    public ConsolidatedResponse execute(String month) {
        List<Income> incomes = incomeRepository.findByMonth(month);

        List<Outcome> outcomes = outcomeRepository.findByMonth(month);

        Consolidated consolidated = new Consolidated(incomes, outcomes);

        BigDecimal totalIncomes = calculateTotalIncomes(incomes);
        BigDecimal totalOutcomes = calculateTotalOutcomes(outcomes);
        boolean statusConsolidation = totalIncomes.compareTo(totalOutcomes) > 0;
        BigDecimal consolidation = statusConsolidation ? (totalIncomes.subtract(totalOutcomes)) : (totalOutcomes.subtract(totalIncomes));

        return
                new ConsolidatedResponse(
                        consolidated,
                        totalIncomes,
                        totalOutcomes,
                        consolidation,
                        statusConsolidation ? CONSOLIDATED_MONTHLY_STATUS.GREEN : CONSOLIDATED_MONTHLY_STATUS.RED
                );
    }

    private BigDecimal calculateTotalIncomes(List<Income> incomes) {
        return incomes
                .stream()
                .map(Income::getIncomeValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculateTotalOutcomes(List<Outcome> outcomes) {
        return outcomes
                .stream()
                .map(Outcome::getTotalOutcomeValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
