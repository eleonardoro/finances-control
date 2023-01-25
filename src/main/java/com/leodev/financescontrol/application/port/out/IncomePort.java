package com.leodev.financescontrol.application.port.out;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;

public interface IncomePort {

    void save(IncomeRequest incomeRequest);

    void findByMonth(String month);
}
