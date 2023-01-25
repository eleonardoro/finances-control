package com.leodev.financescontrol.application.port.in;

import com.leodev.financescontrol.adapter.in.outcomes.OutcomeRequest;

public interface OutcomeRegisterUseCase {

    boolean execute(OutcomeRequest outcomeRequest);
}

