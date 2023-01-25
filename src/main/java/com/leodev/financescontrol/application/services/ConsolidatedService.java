package com.leodev.financescontrol.application.services;

import com.leodev.financescontrol.adapter.out.IncomeRepository;
import com.leodev.financescontrol.adapter.out.OutcomeRepository;
import com.leodev.financescontrol.application.port.in.ConsolidatedUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsolidatedService implements ConsolidatedUseCase {

    @Autowired
    OutcomeRepository outcomeRepository;

    @Autowired
    IncomeRepository incomeRepository;

    @Override
    public boolean execute(String month) {
        //outcomePort.save(outcomeRequest);
        return true;
    }
}
