package com.WhatToWear.WhatToWear;

import com.WhatToWear.WhatToWear.Model.Clothes;
import com.WhatToWear.WhatToWear.repo.ClothesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClothesController {

    @Autowired
    ClothesRepo repo2;

    @PostMapping("/addClothing")
    public void addClothes(@RequestBody Clothes clothing ){
        repo2.save(clothing);
    }
}