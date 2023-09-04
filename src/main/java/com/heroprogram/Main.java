package com.heroprogram;

public class Main {

    public static void main(String[] args) {
        Website naver = new Naver();

        Person gun = new Person("강건", "990419");
        Person hero = new Person("김영웅", "990516");

        naver.signUp(gun);
//        naver.signUp(hero);

    }
}
