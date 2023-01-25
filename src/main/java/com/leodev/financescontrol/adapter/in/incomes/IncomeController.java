package com.leodev.financescontrol.adapter.in.incomes;

import com.leodev.financescontrol.application.services.income.IncomeFindByMonthService;
import com.leodev.financescontrol.application.services.income.IncomeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/incomes")
public class IncomeController {
    IncomeRegisterService incomeRegisterService;

    IncomeFindByMonthService incomeFindByMonthService;

    @Autowired
    public IncomeController(IncomeRegisterService incomeRegisterService, IncomeFindByMonthService incomeFindByMonthService) {
        this.incomeRegisterService = incomeRegisterService;
        this.incomeFindByMonthService = incomeFindByMonthService;
    }

    @PostMapping
    public void register(@RequestBody IncomeRequest request) {
        incomeRegisterService.execute(request);
    }

    @GetMapping()
    void findByMonth(@RequestParam("month") String month) {
        incomeFindByMonthService.execute(month);
    }
}
