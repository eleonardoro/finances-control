package com.leodev.financescontrol.adapter.out.h2;

import com.leodev.financescontrol.application.domain.income.Income;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IncomeH2Repository extends CrudRepository<Income, Long> {

    @Query(value = "SELECT * FROM INCOME i WHERE (SUBSTRING(i.date, 6, 2)) = ?1",
            nativeQuery = true)
    List<Income> findIncomesByMonth(String month);
}
