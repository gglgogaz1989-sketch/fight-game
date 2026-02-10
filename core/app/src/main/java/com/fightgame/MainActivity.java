package com.fightgame;

import android.app.Activity;
import android.os.Bundle;
import com.fightgame.core.*; // Импортируем все твои коды из папки core

public class MainActivity extends Activity {
    
    // Пример использования твоего кода из папки core
    // private ServerLogic gameServer; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Тут вызываем твои окна с 4 строками и логику
        showMenu();
    }
    
    private void showMenu() {
        // Твой код вызова меню
    }
}

