package com.WhatToWear.WhatToWear;

import com.WhatToWear.WhatToWear.Model.User;
import com.WhatToWear.WhatToWear.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user ){
        userRepo.save(user);
    }
}