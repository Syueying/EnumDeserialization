package com.example.EnumDeserialization;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.fastjson2.JSON;
import com.example.EnumDeserialization.model.People;

@SpringBootApplication
public class EnumDeserializationApplication {
	public static void main(String[] args) {
		String msg = "{\"name\": \"Jone Doe\",\"gender\": 1}";

		People person = JSON.parseObject(msg, People.class);
		System.out.println(person.getGender().getName());
	}
}
