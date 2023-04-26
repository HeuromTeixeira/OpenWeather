package com.mercadolivre.clima.Api_Clima.controller;
import com.mercadolivre.clima.Api_Clima.model.ClimaModel;
import com.mercadolivre.clima.Api_Clima.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.xml.stream.events.Characters;

@RestController
@RequestMapping("/clima")
public class ClimaController {

    @Autowired
    ClimaService climaService;

    @GetMapping
    public Mono<ClimaModel> ConsultaClimaporLongitudeLatitude(@RequestParam String lat,
                                                              @RequestParam String lon){
               return climaService.ConsultaClimaporLongitudeLatitude(lat,lon);
    }
}
