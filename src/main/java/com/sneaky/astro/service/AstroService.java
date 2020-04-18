package com.sneaky.astro.service;

import com.sneaky.astro.json.AstroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AstroService {

    private RestTemplate template;
    private String url = "http://api.open-notify.org/astros.json";

    @Autowired
    public AstroService(RestTemplateBuilder builder) {
        template = builder.build();
    }

    public AstroResponse getAstroData() {
        return template.getForObject(url, AstroResponse.class);
    }

    public ResponseEntity<AstroResponse> getAstroDataEntity() {
        return template.getForEntity(url, AstroResponse.class);
    }
}
