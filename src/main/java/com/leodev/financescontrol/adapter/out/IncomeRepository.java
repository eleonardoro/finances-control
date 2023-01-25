package com.leodev.financescontrol.adapter.out;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;
import com.leodev.financescontrol.adapter.out.h2.H2Repository;
import com.leodev.financescontrol.application.port.out.IncomePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeRepository implements IncomePort {

    @Autowired
    H2Repository h2Repository;

    @Override
    public void save(IncomeRequest incomeRequest) {
        h2Repository.save(incomeRequest.toIncome());

    }
}
