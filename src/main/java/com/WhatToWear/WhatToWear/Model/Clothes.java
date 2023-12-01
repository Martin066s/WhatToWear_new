package com.WhatToWear.WhatToWear.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "clothes")
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String category;
    private Long minTemp;
    private Long maxTemp;
    private String pathPic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Long minTemp) {
        this.minTemp = minTemp;
    }

    public Long getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Long maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getPathPic() {
        return pathPic;
    }

    public void setPathPic(String pathPic) {
        this.pathPic = pathPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(id, clothes.id) && Objects.equals(name, clothes.name) && Objects.equals(category, clothes.category) && Objects.equals(minTemp, clothes.minTemp) && Objects.equals(maxTemp, clothes.maxTemp) && Objects.equals(pathPic, clothes.pathPic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, minTemp, maxTemp, pathPic);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                ", pathPic='" + pathPic + '\'' +
                '}';
    }
}
