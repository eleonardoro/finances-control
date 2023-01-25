package com.leodev.financescontrol.adapter.in.incomes;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.leodev.financescontrol.application.domain.income.Income;
import com.leodev.financescontrol.application.domain.income.enums.INCOME_PAYMENT_METHOD;
import com.leodev.financescontrol.application.domain.income.enums.INCOME_RECURRENCE_TYPE;
import com.leodev.financescontrol.application.domain.income.enums.INCOME_STATUS;
import com.leodev.financescontrol.application.domain.income.enums.INCOME_TYPE;
import lombok.Setter;

import java.math.BigDecimal;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Setter
public class IncomeRequest {
    //TODO validar objetos
    private INCOME_TYPE incomeType;
    private String debitor;

    private String description;

    private String date;

    private BigDecimal incomeValue;

    private INCOME_PAYMENT_METHOD paymentMethod;

    private boolean recurrent;

    private INCOME_RECURRENCE_TYPE recurrenceType;

    private int recurrencesToPay;

    private int recurrencesPaid;

    private INCOME_STATUS status;

    private String comment;

    public Income toIncome() {
        return new Income(debitor, description, incomeType, date, incomeValue, paymentMethod, recurrent, recurrenceType, recurrencesToPay, recurrencesPaid, status, comment);
    }
}
