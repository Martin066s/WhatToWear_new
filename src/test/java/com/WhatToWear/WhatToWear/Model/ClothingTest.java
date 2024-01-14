package com.WhatToWear.WhatToWear.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ClothingTest {

    @Test
    void setUserId() {
        Clothing clothing = Clothing.builder()
                .id(30)
                .name("T-Shirt")
                .minTemp(15)
                .category("Oberteil")
                .userId(1)
                .pathPic("pretty/pics")
                .build();

        clothing.setUserId(5);

        long expected = 5;
        long actual = clothing.getUserId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getName() {
        Clothing clothing = Clothing.builder()
                .id(30)
                .name("T-Shirt")
                .minTemp(15)
                .category("Oberteil")
                .userId(1)
                .pathPic("pretty/pics")
                .build();

        String expected = "T-Shirt";
        String actual = clothing.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testHashCode() {
        Clothing clothing = Clothing.builder()
                .id(30)
                .name("T-Shirt")
                .minTemp(15)
                .category("Oberteil")
                .userId(1)
                .pathPic("pretty/pics")
                .build();

        int expected = Objects.hash("T-Shirt");
        int actual = clothing.hashCode();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        Clothing clothing = Clothing.builder()
                .id(30)
                .name("T-Shirt")
                .minTemp(15)
                .category("Oberteil")
                .userId(1)
                .pathPic("pretty/pics")
                .build();

        String expected = "Clothing{" +
                "id=30" +
                ", userId=1" +
                ", name='T-Shirt" + '\'' +
                ", category='Oberteil" + '\'' +
                ", minTemp=15"  +
                ", pathPic='pretty/pics" + '\'' +
                '}';

        String actual = clothing.toString();

        Assertions.assertEquals(expected, actual);
    }
}
