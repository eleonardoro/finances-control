package com.leodev.financescontrol.application.services;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;
import com.leodev.financescontrol.adapter.out.IncomeRepository;
import com.leodev.financescontrol.application.port.in.IncomeRegisterUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeRegisterService implements IncomeRegisterUseCase {

    @Autowired
    IncomeRepository incomeRepository;

    @Override
    public boolean execute(IncomeRequest incomeRequest) {
        incomeRepository.save(incomeRequest);
        return true;
    }
}
