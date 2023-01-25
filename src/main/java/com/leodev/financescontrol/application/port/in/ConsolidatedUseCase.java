package com.leodev.financescontrol.application.port.in;

import com.leodev.financescontrol.application.domain.consolidated.ConsolidatedResponse;

public interface ConsolidatedUseCase {

    ConsolidatedResponse execute(String month);
}

