package com.leodev.financescontrol.application.services;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;
import com.leodev.financescontrol.adapter.out.IncomeRepository;
import com.leodev.financescontrol.application.port.in.RegisterIncomeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeService implements RegisterIncomeUseCase {

    @Autowired
    IncomeRepository incomePort;

    @Override
    public boolean execute(IncomeRequest incomeRequest) {
        incomePort.save(incomeRequest);
        return true;
    }
}
