package com.WhatToWear.WhatToWear.repo;

import com.WhatToWear.WhatToWear.Model.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClothesRepo extends JpaRepository<Clothes, Long> {
}
