package com.gm.iot.hub.analyzer.repository;

import com.gm.iot.hub.analyzer.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {

}
