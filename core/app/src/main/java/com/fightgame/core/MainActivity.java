package com.fightgame;

import android.app.Activity;
import android.os.Bundle;
import com.fightgame.ui.ServerDialog;

public class MainActivity extends Activity {
    // Твои настройки профиля
    String myNickname = "Player1";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        
        // Логика: если имя уже есть в базе друзей - просим сменить
        checkNicknameUnique();
    }
    
    // Функция кнопки "ИГРАТЬ" -> "СОЗДАТЬ"
    public void onCreateServerClick() {
        ServerDialog.show(this);
    }
}

