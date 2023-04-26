package com.mercadolivre.clima.Api_Clima.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ClimaModel {

    private String lat; //latitude
    private String lon; // Longitude,
    private LocalDateTime sunrise; // Date(),
    private LocalDateTime sunset; // Date(),
    private double temp; // Celsius,
    private double feelslike; // Celsius,
    private int pressure; // Pascal
    private int humidity; // %

}
