package com.leodev.financescontrol.adapter.in.outcomes;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.leodev.financescontrol.application.domain.outcome.Outcome;
import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_PAYMENT_METHOD;
import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_RECURRENCE_TYPE;
import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_STATUS;
import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_TYPE;
import lombok.Setter;

import java.math.BigDecimal;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Setter
public class OutcomeRequest {
    //TODO validar objetos
    private String description;

    private String creditor;

    private OUTCOME_TYPE outcomeType;

    private String date;

    private BigDecimal totalOutcomeValue;

    private OUTCOME_PAYMENT_METHOD paymentMethod;

    private boolean recurrent;

    private OUTCOME_RECURRENCE_TYPE recurrenceType;

    private int recurrencesToPay;

    private int recurrencesPaid;

    private OUTCOME_STATUS status;

    private String comment;

    public Outcome toOutcome() {
        return new Outcome(creditor, description, outcomeType, date, totalOutcomeValue, paymentMethod, recurrent, recurrenceType, recurrencesToPay, recurrencesPaid, status, comment);
    }
}
