package com.fightgame;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.InputType;
import android.widget.*;
import android.view.Gravity;
import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем фон меню
        LinearLayout menuLayout = new LinearLayout(this);
        menuLayout.setOrientation(LinearLayout.VERTICAL);
        menuLayout.setGravity(Gravity.CENTER);
        menuLayout.setBackgroundColor(0xFF121212); // Темный фон

        // 1. Иконка игрока (в углу)
        ImageView profileIcon = new ImageView(this);
        profileIcon.setImageResource(android.R.drawable.ic_menu_gallery); // Замени на свою 1000014246
        
        // 2. Кнопка "ИГРАТЬ"
        Button btnPlay = new Button(this);
        btnPlay.setText("ИГРАТЬ");
        btnPlay.setOnClickListener(v -> showCreateServerDialog());

        // 3. Кнопка "ДРУЗЬЯ"
        Button btnFriends = new Button(this);
        btnFriends.setText("ДРУЗЬЯ");
        btnFriends.setOnClickListener(v -> Toast.makeText(this, "Список друзей пуст", Toast.LENGTH_SHORT).show());

        // 4. Кнопка "НАСТРОЙКИ"
        Button btnSettings = new Button(this);
        btnSettings.setText("НАСТРОЙКИ");

        // Добавляем всё на экран
        menuLayout.addView(btnPlay);
        menuLayout.addView(btnFriends);
        menuLayout.addView(btnSettings);
        
        setContentView(menuLayout);
    }

    // Тот самый метод с 4 строками ввода
    private void showCreateServerDialog() {
        LinearLayout dialogLayout = new LinearLayout(this);
        dialogLayout.setOrientation(LinearLayout.VERTICAL);
        dialogLayout.setPadding(50, 40, 50, 40);

        EditText etName = new EditText(this); etName.setHint("1. Название сервера");
        
        EditText etPass = new EditText(this); etPass.setHint("2. Пароль сервера");
        etPass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        EditText etId = new EditText(this); 
        etId.setHint("3. ID (Рандом)");
        etId.setText("ID-" + (new Random().nextInt(9000) + 1000));

        EditText etMax = new EditText(this); etMax.setHint("4. Макс. людей (2-6)");
        etMax.setInputType(InputType.TYPE_CLASS_NUMBER);

        CheckBox cbFriends = new CheckBox(this); cbFriends.setText("Только для друзей");

        dialogLayout.addView(etName);
        dialogLayout.addView(etPass);
        dialogLayout.addView(etId);
        dialogLayout.addView(etMax);
        dialogLayout.addView(cbFriends);

        new AlertDialog.Builder(this)
            .setTitle("Создание сервера")
            .setView(dialogLayout)
            .setPositiveButton("Создать", (d, w) -> {
                // Код запуска сервера
            })
            .show();
    }
}
