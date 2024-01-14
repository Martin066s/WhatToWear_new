package com.WhatToWear.WhatToWear.controller;

import com.WhatToWear.WhatToWear.Model.Clothing;
import com.WhatToWear.WhatToWear.repo.ClothesRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.annotation.Rollback;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ClothesControllerTest {

    @Autowired
    private ClothesRepo clothesRepo;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveClothing(){

        Clothing clothing = Clothing.builder()
                .name("T-Shirt")
                .minTemp(15)
                .category("Oberteil")
                .userId(1)
                .pathPic("pretty/pics")
                .build();

        clothesRepo.save(clothing);

        Assertions.assertThat(clothing.getId()).isGreaterThan(0);
    }

}
