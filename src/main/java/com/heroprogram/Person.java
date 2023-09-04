package com.heroprogram;

public class Person {
    private String name;
    private String registrationId;
    private String id;
    private String pw;

    public Person(String name, String registrationId) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name은 공백일 수 없습니다.");
        } else {
            this.name = name;
        }

        if (registrationId.isEmpty()) {
            throw new IllegalArgumentException("phoneNum은 공백일 수 없습니다.");
        } else {
            this.registrationId = registrationId;
        }
    }

    public String getName() {
        return name;
    }

    public String getRegistrationId() {
        return registrationId;
    }
}
