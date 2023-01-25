package com.leodev.financescontrol.adapter.in.consolidated;

import com.leodev.financescontrol.application.domain.consolidated.ConsolidatedResponse;
import com.leodev.financescontrol.application.services.consolidated.ConsolidatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/consolidated")
public class ConsolidatedController {
    ConsolidatedService consolidatedService;

    @Autowired
    public ConsolidatedController(ConsolidatedService consolidatedService) {
        this.consolidatedService = consolidatedService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ConsolidatedResponse> register(@RequestParam("month") String month) {

        ConsolidatedResponse consolidatedResponse = consolidatedService.execute(month);

        return ResponseEntity.ok().body(consolidatedResponse);
    }
}
