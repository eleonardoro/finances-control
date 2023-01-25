package com.leodev.financescontrol.adapter.in.consolidated;

import com.leodev.financescontrol.application.services.OutcomeServiceRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/consolidated")
public class ConsolidatedController {
    OutcomeServiceRegister registerOutcomeUseCase;

    @Autowired
    public ConsolidatedController(OutcomeServiceRegister registerOutcomeUseCase) {
        this.registerOutcomeUseCase = registerOutcomeUseCase;
    }

    @GetMapping
    public void register(@RequestHeader String month) {

        //registerOutcomeUseCase.execute(month);
    }
}
