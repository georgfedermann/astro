package com.sneaky.astro.service;

import com.sneaky.astro.json.AstroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AstroService {

    private RestTemplate template;

    @Autowired
    public AstroService(RestTemplateBuilder builder) {
        template = builder.build();
    }

    public AstroResponse getAstroData() {
        String url = "http://api.open-notify.org/astros.json";
        return template.getForObject(url, AstroResponse.class);
    }
}
