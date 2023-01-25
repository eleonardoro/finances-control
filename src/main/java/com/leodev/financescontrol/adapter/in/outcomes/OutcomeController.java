package com.leodev.financescontrol.adapter.in.outcomes;

import com.leodev.financescontrol.application.services.OutcomeFindByMonthService;
import com.leodev.financescontrol.application.services.OutcomeServiceRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/outcomes")
public class OutcomeController {
    OutcomeServiceRegister registerOutcomeUseCase;

    OutcomeFindByMonthService outcomeFindByMonthService;

    @Autowired
    public OutcomeController(OutcomeServiceRegister registerOutcomeUseCase, OutcomeFindByMonthService outcomeFindByMonthService) {
        this.registerOutcomeUseCase = registerOutcomeUseCase;
        this.outcomeFindByMonthService = outcomeFindByMonthService;
    }

    @PostMapping
    public void register(@RequestBody OutcomeRequest request) {
        registerOutcomeUseCase.execute(request);
    }

    @GetMapping()
    void findByMonth(@RequestParam("month") String month) {
        outcomeFindByMonthService.execute(month);
    }
}
