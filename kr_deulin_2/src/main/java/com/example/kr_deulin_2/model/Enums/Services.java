package com.example.kr_deulin_2.model.Enums;

import lombok.Getter;

@Getter
public class Services {


    public Services(String description, Integer price,int id) {
        this.description = description;
        this.price = price;
        this.id = id;
    }

    private Integer id;

    private String description;

    private Integer price;

}
