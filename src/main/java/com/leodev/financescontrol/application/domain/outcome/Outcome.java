package com.leodev.financescontrol.application.domain.outcome;

import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_PAYMENT_METHOD;
import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_RECURRENCE_TYPE;
import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_STATUS;
import com.leodev.financescontrol.application.domain.outcome.enums.OUTCOME_TYPE;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor

public class Outcome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;

    @Column()
    private String creditor;
    @Column
    @Enumerated(EnumType.STRING)
    private OUTCOME_TYPE outcomeType;
    @Column
    private String date;
    @Column
    private BigDecimal totalOutcomeValue;
    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private OUTCOME_PAYMENT_METHOD paymentMethod;
    @Column()
    private boolean recurrent;
    @Column
    @Enumerated(EnumType.STRING)
    private OUTCOME_RECURRENCE_TYPE recurrenceType;
    @Column(name = "recurrences_to_pay")
    private int recurrencesToPay;
    @Column(name = "recurrences_paid")
    private int recurrencesPaid;
    @Column()
    @Enumerated(EnumType.STRING)
    private OUTCOME_STATUS status;
    @Column
    private String comment;

    public Outcome(String creditor, String description, OUTCOME_TYPE outcomeType, String date, BigDecimal totalOutcomeValue, OUTCOME_PAYMENT_METHOD paymentMethod, boolean recurrent, OUTCOME_RECURRENCE_TYPE recurrenceType, int recurrencesToPay, int recurrencesPaid, OUTCOME_STATUS status, String comment) {
        this.creditor = creditor;
        this.description = description;
        this.outcomeType = outcomeType;
        this.date = date;
        this.totalOutcomeValue = totalOutcomeValue;
        this.paymentMethod = paymentMethod;
        this.recurrent = recurrent;
        this.recurrenceType = recurrenceType;
        this.recurrencesToPay = recurrencesToPay;
        this.recurrencesPaid = recurrencesPaid;
        this.status = status;
        this.comment = comment;
    }
}
