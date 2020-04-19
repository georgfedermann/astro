package com.sneaky.astro.service;

import com.sneaky.astro.json.AstroResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
class AstroServiceTest {

    @Autowired
    private AstroService service;

    @Test
    void getAstroDataTest() {
        AstroResponse response = service.getAstroData();
        assertAll(
                () -> assertThat(response.getNumber()).isGreaterThan(0),
                () -> assertThat(response.getNumber()).isEqualTo(response.getPeople().size()));
    }

    @Test
    void getAstroDataEntityTest() {
        ResponseEntity<AstroResponse> response = service.getAstroDataEntity();
        System.out.println(response);
        System.out.println(response.getStatusCode());
        response.getHeaders().entrySet().forEach(System.out::println);
        System.out.println(response.getHeaders().get("content-type"));
        System.out.println(response.getBody().getClass());
        response.getBody().getPeople().forEach(System.out::println);
    }

}