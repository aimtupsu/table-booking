package com.aimtupsu.tablebooking.kafkaintegration.model;

import java.time.LocalTime;

public record OuterKafkaMessageModel(
    String placeName,
    String placeId,
    String restaurantName,
    String restaurantId,
    String client,
    String guest,
    String clientFIO,
    LocalTime time,
    String timeString,
    Integer tableNo,
    String tableId,
    String table
) {

}
