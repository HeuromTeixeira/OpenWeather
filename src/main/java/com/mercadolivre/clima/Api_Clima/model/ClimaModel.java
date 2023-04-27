package com.mercadolivre.clima.Api_Clima.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaModel {

    private Coord coord;
    //public ArrayList<Weather> weather;
    private  Sys sys;
    private  Main main;


}

