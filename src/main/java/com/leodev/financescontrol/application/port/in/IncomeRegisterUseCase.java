package com.leodev.financescontrol.application.port.in;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;

public interface IncomeRegisterUseCase {

    boolean execute(IncomeRequest incomeRequest);

}

