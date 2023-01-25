package com.leodev.financescontrol.application.services;

import com.leodev.financescontrol.adapter.out.OutcomeRepository;
import com.leodev.financescontrol.application.port.in.IncomeFindByMonthUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutcomeFindByMonthService implements IncomeFindByMonthUseCase {

    @Autowired
    OutcomeRepository outcomeRepository;

    @Override
    public boolean execute(String month) {
        outcomeRepository.findByMonth(month);
        return true;
    }
}
