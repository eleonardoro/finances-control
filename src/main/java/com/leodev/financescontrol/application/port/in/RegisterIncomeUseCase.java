package com.leodev.financescontrol.application.port.in;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;

public interface RegisterIncomeUseCase {

    boolean execute(IncomeRequest incomeRequest);
}

