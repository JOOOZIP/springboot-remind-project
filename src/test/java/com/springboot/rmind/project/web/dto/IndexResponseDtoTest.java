package com.springboot.rmind.project.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IndexResponseDtoTest {

    @Test
    public void lombok_skill_test(){
        String name = "test";
        int amount = 1000;

        IndexResponseDto dto = new IndexResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
