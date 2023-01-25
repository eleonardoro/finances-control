package com.leodev.financescontrol.application.services;

import com.leodev.financescontrol.adapter.in.outcomes.OutcomeRequest;
import com.leodev.financescontrol.adapter.out.OutcomeRepository;
import com.leodev.financescontrol.application.port.in.OutcomeRegisterUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutcomeServiceRegister implements OutcomeRegisterUseCase {

    @Autowired
    OutcomeRepository outcomeRepository;

    @Override
    public boolean execute(OutcomeRequest outcomeRequest) {
        outcomeRepository.save(outcomeRequest);
        return true;
    }
}
