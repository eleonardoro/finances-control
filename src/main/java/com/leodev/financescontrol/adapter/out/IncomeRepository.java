package com.leodev.financescontrol.adapter.out;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;
import com.leodev.financescontrol.adapter.out.h2.IncomeH2Repository;
import com.leodev.financescontrol.application.domain.income.Income;
import com.leodev.financescontrol.application.port.out.IncomePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeRepository implements IncomePort {

    @Autowired
    IncomeH2Repository incomeH2Repository;

    @Override
    public void save(IncomeRequest incomeRequest) {
        incomeH2Repository.save(incomeRequest.toIncome());
    }

    @Override
    public List<Income> findByMonth(String month) {
        return incomeH2Repository.findIncomesByMonth(month);
    }
}
