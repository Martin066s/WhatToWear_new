package com.WhatToWear.WhatToWear;

import com.WhatToWear.WhatToWear.Model.Clothing;
import com.WhatToWear.WhatToWear.repo.ClothesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClothesController {

    @Autowired
    ClothesRepo clothesRepo;

    @PostMapping("/addClothing")
    public void addClothing(@RequestBody Clothing clothing ){
        clothesRepo.save(clothing);
    }
}