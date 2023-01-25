package com.leodev.financescontrol.application.services.income;

import com.leodev.financescontrol.adapter.out.IncomeRepository;
import com.leodev.financescontrol.application.port.in.IncomeFindByMonthUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeFindByMonthService implements IncomeFindByMonthUseCase {

    @Autowired
    IncomeRepository incomeRepository;

    @Override
    public boolean execute(String month) {
        incomeRepository.findByMonth(month);
        return true;
    }
}
