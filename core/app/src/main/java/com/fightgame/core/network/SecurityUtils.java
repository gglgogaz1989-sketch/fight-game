package com.fightgame.core.network;

import java.security.MessageDigest;

public class SecurityUtils {
    // Превращает пароль в защищенный хэш SHA-256
    public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString(); // Вернет что-то вроде "5e884898da..."
        } catch (Exception e) {
            return null;
        }
    }
}

