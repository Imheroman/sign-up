package com.heroprogram;

import java.util.Objects;

public class Member {
    private String id;
    private String password;
    private final Person person;

    public Member(String id, String password, Person person) {
        if (id.isEmpty()) {
            throw new IllegalArgumentException("id is empty");
        } else {
            this.id = id;
        }

        if (password.isEmpty()) {
            throw new IllegalArgumentException("password is empty");
        } else {
            this.password = password;
        }

        if (Objects.isNull(person)) {
            throw new IllegalArgumentException("person is null");
        } else {
            this.person = person;
        }
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Person getPerson() {
        return person;
    }

}
