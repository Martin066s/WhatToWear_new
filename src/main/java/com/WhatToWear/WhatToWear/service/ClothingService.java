package com.WhatToWear.WhatToWear.service;

import com.WhatToWear.WhatToWear.Model.Clothing;
import com.WhatToWear.WhatToWear.repo.ClothesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
public class ClothingService {}/*

    public void addClothing(Clothing clothing ){
        clothesRepo.save(clothing);
    }


    public List<Clothing> getClothing() {
        return clothesRepo.findAll();
    }

    public Clothing getClothingById(long id) {
        if (clothesRepo.existsById(id)){
            return clothesRepo.getReferenceById(id);
        }
        return null;
    }

    public boolean update(Clothing clothing) {
        if (!clothesRepo.existsById(clothing.getId())) {
            return false;
        }

        Clothing temp = clothesRepo.getReferenceById(clothing.getId());
        temp.setName(clothing.getName());
        temp.setUserId(clothing.getUserId());
        temp.setMinTemp(clothing.getMinTemp());
        temp.setCategory(clothing.getCategory());
        temp.setPathPic(clothing.getPathPic());

        return true;
    }

    public boolean deleteClothingById(long id) {
        if (!clothesRepo.existsById(id)) {
            return false;
        }

        clothesRepo.deleteById(id);
        return true;
    }

}
*/