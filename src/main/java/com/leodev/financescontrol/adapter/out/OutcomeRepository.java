package com.leodev.financescontrol.adapter.out;

import com.leodev.financescontrol.adapter.in.outcomes.OutcomeRequest;
import com.leodev.financescontrol.adapter.out.h2.OutcomeH2Repository;
import com.leodev.financescontrol.application.domain.outcome.Outcome;
import com.leodev.financescontrol.application.port.out.OutcomePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutcomeRepository implements OutcomePort {

    @Autowired
    OutcomeH2Repository outcomeH2Repository;

    @Override
    public void save(OutcomeRequest outcomeRequest) {
        outcomeH2Repository.save(outcomeRequest.toOutcome());
    }

    @Override
    public List<Outcome> findByMonth(String month) {
        return outcomeH2Repository.findOutcomesByMonth(month);
    }
}
