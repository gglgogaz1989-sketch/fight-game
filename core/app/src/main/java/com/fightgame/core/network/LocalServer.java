package com.fightgame.core.network;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class LocalServer extends Thread {
    private int port = 8080;
    private String serverPassword;
    private int maxPlayers;
    private boolean isRunning = true;
    public ArrayList<Socket> clients = new ArrayList<>();

    public LocalServer(String pass, int max) {
        this.serverPassword = SecurityUtils.hashPassword(pass); // Прячем пароль
        this.maxPlayers = max;
    }

    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (isRunning && clients.size() < maxPlayers) {
                Socket clientSocket = serverSocket.accept();
                // Логика проверки пароля от друга будет тут
                clients.add(clientSocket);
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}

