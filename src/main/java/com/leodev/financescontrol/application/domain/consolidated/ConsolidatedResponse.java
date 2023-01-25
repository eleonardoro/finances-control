package com.leodev.financescontrol.application.domain.consolidated;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class ConsolidatedResponse {

    Consolidated consolidated;

    BigDecimal totalIncomes;
    BigDecimal totalOutcomes;
    BigDecimal consolidation;
    CONSOLIDATED_MONTHLY_STATUS status;
}
