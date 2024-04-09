package com.example.EnumDeserialization.model;

import com.alibaba.fastjson2.annotation.JSONField;
import com.example.EnumDeserialization.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * People
 */
@Getter
@AllArgsConstructor
public class People {

    @JSONField(name = "name")
    String name;

    @JSONField(name = "gender")
    Gender gender;

}