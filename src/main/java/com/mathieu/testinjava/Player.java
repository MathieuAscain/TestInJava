package com.mathieu.testinjava;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String username;
    private int age;
    private String email;
    private List<Player> friends;

    public Player(String username, int age) {
        this.username = username;
        this.age = age;
        this.email = username + "@ubisoft.com";
        friends = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void addFriend(Player player, VerifyPlayer verifyPlayer) {
        if (verifyPlayer.isAValidPlayer(player)) {
            friends.add(player);
        }
    }

    public List<Player> getFriends() {
        return friends;
    }
}
