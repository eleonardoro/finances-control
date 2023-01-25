package com.leodev.financescontrol.application.port.out;

import com.leodev.financescontrol.adapter.in.outcomes.OutcomeRequest;
import com.leodev.financescontrol.application.domain.outcome.Outcome;

import java.util.List;

public interface OutcomePort {

    void save(OutcomeRequest outcomeRequest);

    List<Outcome> findByMonth(String month);

}
