package com.WhatToWear.WhatToWear.controller;

import com.WhatToWear.WhatToWear.Model.Clothing;
import com.WhatToWear.WhatToWear.repo.ClothesRepo;
import com.WhatToWear.WhatToWear.service.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClothesController {

    @Autowired
    ClothesRepo clothesRepo;
    ClothingService service = new ClothingService();

    @PostMapping("/Clothing")
    public Clothing addClothing(@RequestBody Clothing clothing) {
        return clothesRepo.save(clothing);
    }

    @GetMapping("/Clothing")
    public List<Clothing> getClothing() {return clothesRepo.findAll();
    }

//fehlerhaft
/*    @GetMapping("/Clothing/{id}")
    public Clothing getClothingById(@PathVariable long id) {
        if (clothesRepo.existsById(id)){
            return clothesRepo.getReferenceById(id);
        }
        return null;
    }*/

    @PutMapping("/Clothing")
    public boolean updateClothingById(@RequestBody Clothing clothing){
        if (!clothesRepo.existsById(clothing.getId())) {
            return false;
        }

        clothesRepo.save(clothing);

        return true;
    }

    @DeleteMapping("Clothing/{id}")
    public boolean deleteClothing(@PathVariable long id){
        if (!clothesRepo.existsById(id)) {
            return false;
        }

        clothesRepo.deleteById(id);
        return true;
    }
}
