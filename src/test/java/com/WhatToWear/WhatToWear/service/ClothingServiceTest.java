package com.WhatToWear.WhatToWear.service;

import com.WhatToWear.WhatToWear.Model.Clothing;
import com.WhatToWear.WhatToWear.repo.ClothesRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ClothingServiceTest {

    @Autowired
    private ClothesRepo clothesRepo;
    @Test
    public void createClothing() {
        Clothing tShirt = Clothing.builder()
                .id(1L)
                .name("T-Shirt")
                .userId(1)
                .minTemp(20L)
                .category("Oberteil")
                .build();

        clothesRepo.save(tShirt);

        Assertions.assertTrue((tShirt.getId() > 0));
    }
}