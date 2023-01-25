package com.leodev.financescontrol.adapter.in.incomes;

import com.leodev.financescontrol.application.services.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/incomes")
public class IncomesController {
    IncomeService registerIncomeUseCase;

    @Autowired
    public IncomesController(IncomeService registerIncomeUseCase) {
        this.registerIncomeUseCase = registerIncomeUseCase;
    }

    @PostMapping
    public void register(@RequestBody IncomeRequest request) {
        registerIncomeUseCase.execute(request);
    }
}
