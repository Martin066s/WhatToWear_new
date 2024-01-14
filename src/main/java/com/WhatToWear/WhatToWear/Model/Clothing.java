package com.WhatToWear.WhatToWear.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "clothes")
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long userId;
    @Column(nullable = false)
    private String name;
    private String category;
    @Column(nullable = false)
    private long minTemp;
    private String pathPic;

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public long getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(long minTemp) {
        this.minTemp = minTemp;
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
        Clothing clothing = (Clothing) o;
        return Objects.equals(id, clothing.id) && Objects.equals(userId, clothing.userId) && Objects.equals(name, clothing.name) && Objects.equals(category, clothing.category) && Objects.equals(minTemp, clothing.minTemp) && Objects.equals(pathPic, clothing.pathPic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", minTemp=" + minTemp +
                ", pathPic='" + pathPic + '\'' +
                '}';
    }
}
