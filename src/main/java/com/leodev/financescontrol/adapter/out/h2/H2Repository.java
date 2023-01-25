package com.leodev.financescontrol.adapter.out.h2;

import com.leodev.financescontrol.application.domain.income.Income;
import org.springframework.data.repository.CrudRepository;

public interface H2Repository extends CrudRepository<Income, Long> {
}
