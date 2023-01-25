package com.leodev.financescontrol.adapter.out;

import com.leodev.financescontrol.adapter.in.incomes.IncomeRequest;
import com.leodev.financescontrol.adapter.out.h2.IncomeH2Repository;
import com.leodev.financescontrol.application.port.out.IncomePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeRepository implements IncomePort {

    @Autowired
    IncomeH2Repository incomeH2Repository;

    @Override
    public void save(IncomeRequest incomeRequest) {
        incomeH2Repository.save(incomeRequest.toIncome());
    }

    @Override
    public void findByMonth(String month) {
        incomeH2Repository.findIncomesByMonth(month);
    }
}
