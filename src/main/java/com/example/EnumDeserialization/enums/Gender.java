package com.example.EnumDeserialization.enums;
import com.alibaba.fastjson2.annotation.JSONCreator;

import lombok.Getter;

/**
 * Gender
 */
@Getter
public enum Gender {

    MALE(1, "male"),
    FEMALE(0, "female");

    private int code;
    private String name;

    Gender(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @JSONCreator
    public static Gender valueOf(Integer code) {
        if (code == 0) {
            return FEMALE;
        }
        return MALE;
    }

}