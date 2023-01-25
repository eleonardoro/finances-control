package com.leodev.financescontrol.application.port.out;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;
import com.leodev.financescontrol.application.domain.income.Income;

import java.util.List;

public interface IncomePort {

    void save(IncomeRequest incomeRequest);

    List<Income> findByMonth(String month);
}
