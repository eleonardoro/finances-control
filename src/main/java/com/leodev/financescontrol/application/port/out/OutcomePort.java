package com.leodev.financescontrol.application.port.out;

import com.leodev.financescontrol.adapter.in.outcomes.OutcomeRequest;

public interface OutcomePort {

    void save(OutcomeRequest outcomeRequest);

    void findByMonth(String month);

}
