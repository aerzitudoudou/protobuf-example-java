package com.protobuf.example;

import com.google.protobuf.Enum;
import example.enumerations.EnumExample;
import example.enumerations.EnumExample.EnumMessage;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println("Example for Enums");
        EnumMessage.Builder builder = EnumMessage.newBuilder();
        builder.setId(365)
                .setDayOfTheWeek(EnumExample.DayOfTheWeek.TUESDAY);
        EnumMessage message = builder.build();
        System.out.println(message);

    }
}
