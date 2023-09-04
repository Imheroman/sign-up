package com.heroprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class Naver implements Website {
    private final ArrayList<Member> members = new ArrayList<>();
    private String address = "www.naver.com";

    @Override
    public void signUp(Person person) {
        String[] info = getInfo();
        members.add(new Member(info[0], info[1], person));
    }

    private String[] getInfo() {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] info = new String[2];

        System.out.print("Id를 입력하시오: ");
        info[0] = sc.nextLine();
//        info[0] = br.readLine();

        System.out.print("Pw를 입력하시오: ");
        info[1] = sc.nextLine();
//        info[1] = br.readLine();

        return info;
    }

    @Override
    public void findId(Person person) {
        String id = "";
        StringBuilder sb = new StringBuilder();
        ArrayList<Member> members = this.getMembers();

        for (Member member : members) {
            Person p = member.getPerson();

            if (person.equals(p)) {
//                id = person.getName();
                id = member.getId();
                break;
            }
        }

        if (id.isEmpty()) {
            throw new IllegalArgumentException("존재하는 아이디가 없습니다.");
        } else {
            sb.append(id.substring(0, id.length() - 2)).append("**");
        }

        System.out.println("아이디는 " + id + "입니다.");
    }

    public ArrayList<Member> getMembers() {
        return this.members;
    }
}
