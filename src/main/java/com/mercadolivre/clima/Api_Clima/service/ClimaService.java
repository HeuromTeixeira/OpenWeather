package com.mercadolivre.clima.Api_Clima.service;
import com.mercadolivre.clima.Api_Clima.model.ClimaModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;




import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class ClimaService {

    private final WebClient webClient;

    public ClimaService(WebClient.Builder builder) {
        webClient = builder.baseUrl( "https://api.openweathermap.org/data/2.5/weather" ).build();
    }

    public Mono<ClimaModel> ConsultaClimaporLongitudeLatitude(String lat, String lon) {
        log.info( "buscando por longitude e latitude", lat, lon );
        return webClient
                .get()
                .uri( uriBuilder -> uriBuilder
                        .queryParam( "lat", lat )
                        .queryParam( "lon", lon )
                        .queryParam( "appid", "a49be7069c529b5f6e843715a06fa783" )
                        .queryParam( "units" ,"metric")
                        .build() )
                .accept( APPLICATION_JSON )
                .retrieve()
                .bodyToMono( ClimaModel.class );
    }


}
