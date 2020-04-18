package com.sneaky.astro.service;

import com.sneaky.astro.json.AstroResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
class AstroServiceTest {

    @Autowired
    private AstroService service;

    @Test
    void getAstroData() {
        AstroResponse response = service.getAstroData();
        assertAll(
                () -> assertThat(response.getNumber()).isGreaterThan(0),
                () -> assertThat(response.getNumber()).isEqualTo(response.getPeople().size()));
    }

}