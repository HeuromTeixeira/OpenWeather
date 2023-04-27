package com.mercadolivre.clima.Api_Clima.model;

import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
public class Sys {
    //public int id;
    private  Long sunrise;
    private  Long sunset;

    public LocalDateTime getSunrise() {
        return Instant.ofEpochSecond(sunrise).atZone( ZoneId.systemDefault()).toLocalDateTime();
    }

    public LocalDateTime getSunset() {
        return Instant.ofEpochSecond(sunset).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}


