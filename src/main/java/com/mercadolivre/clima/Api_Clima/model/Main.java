package com.mercadolivre.clima.Api_Clima.model;

import lombok.Data;

@Data
public  class  Main{
    private double temp;
    private double feels_like;
    private int pressure;
    private int humidity;
}