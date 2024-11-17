package com.gm.iot.hub.analyzer.service;


import com.gm.iot.hub.analyzer.model.Data;

public interface KafkaDataService {

    void handle(Data data);

}
