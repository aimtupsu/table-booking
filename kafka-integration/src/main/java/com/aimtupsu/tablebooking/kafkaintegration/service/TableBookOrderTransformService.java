package com.aimtupsu.tablebooking.kafkaintegration.service;

import com.aimtupsu.tablebooking.kafkaintegration.model.OuterKafkaMessageModel;
import com.aimtupsu.tablebooking.kafkaintegration.model.TableBookOrderModel;
import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class TableBookOrderTransformService {

  public TableBookOrderModel transform(final OuterKafkaMessageModel outsideModel) {
    return new TableBookOrderModel(
        "test place id",
        "test table id",
        "test guest name",
        LocalTime.now()
    );
  }

}
