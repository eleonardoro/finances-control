package com.leodev.financescontrol.adapter.out.h2;

import com.leodev.financescontrol.application.domain.outcome.Outcome;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OutcomeH2Repository extends CrudRepository<Outcome, Long> {

    @Query(value = "SELECT * FROM OUTCOME i WHERE (SUBSTRING(i.date, 6, 2)) = ?1",
            nativeQuery = true)
    List<Outcome> findOutcomesByMonth(String month);
}
