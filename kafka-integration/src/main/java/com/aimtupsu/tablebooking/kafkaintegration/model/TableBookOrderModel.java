package com.aimtupsu.tablebooking.kafkaintegration.model;

import java.time.LocalTime;

public record TableBookOrderModel(
    String placeId,
    String tableId,
    String guestName,
    LocalTime bookTime
) {

}
