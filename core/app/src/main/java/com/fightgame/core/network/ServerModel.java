package com.fightgame.core.network;

public class ServerModel {
    public String name;
    public String password;
    public String ip;
    public int maxPlayers;
    public int currentPlayers;
    public int ping;
    public boolean onlyFriends;

    public ServerModel(String name, String password, String ip, int maxP, boolean friends) {
        this.name = name;
        this.password = password;
        this.ip = ip;
        this.maxPlayers = maxP;
        this.onlyFriends = friends;
    }
}

