package com.heroprogram;

import java.util.ArrayList;

public class Naver implements Website {
    private final ArrayList<Person> people = new ArrayList<>();
    private String address = "www.naver.com";

    @Override
    public void signUp(Person person) {
        getInfo();
        people.add(person);
    }

    @Override
    public void getInfo() {

    }

    public String findIdByName(Person person) {
        String id = "";
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < people.size(); index++) {
            Person p = people.get(index);
            if (person.getName() == p.getName() && person.getRegistrationId() == p.getRegistrationId()) {
                id = person.getName();
            }
        }

        if (id.isEmpty()) {
            throw new IllegalArgumentException("존재하는 아이디가 없습니다.");
        } else {
            sb.append(id.substring(0, id.length() - 2)).append("**");
        }

        return id;
    }
}
