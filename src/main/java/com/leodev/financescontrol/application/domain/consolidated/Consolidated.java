package com.leodev.financescontrol.application.domain.consolidated;

import com.leodev.financescontrol.application.domain.income.Income;
import com.leodev.financescontrol.application.domain.outcome.Outcome;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
@Getter
public class Consolidated {
    List<Income> incomes;

    List<Outcome> outcomes;
}
