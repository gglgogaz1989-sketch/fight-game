package com.fightgame.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.text.InputType;
import android.widget.*;
import java.util.Random;

public class ServerDialog {
    public static void show(Context context) {
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 40, 40, 40);

        // 1. Название сервера
        EditText etName = new EditText(context); 
        etName.setHint("Название сервера");

        // 2. Пароль (СКРЫТЫЙ - Звездочки)
        EditText etPass = new EditText(context); 
        etPass.setHint("Пароль сервера");
        etPass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        // 3. ID (Рандомный)
        EditText etId = new EditText(context);
        etId.setHint("ID сервера");
        etId.setText("ID-" + (new Random().nextInt(9000) + 1000)); // Генерим рандом

        // 4. Макс людей (2-6)
        EditText etMax = new EditText(context);
        etMax.setHint("Макс. людей (2-6)");
        etMax.setInputType(InputType.TYPE_CLASS_NUMBER);

        // Галочка
        CheckBox cbFriends = new CheckBox(context);
        cbFriends.setText("Только для друзей");

        layout.addView(etName); layout.addView(etPass); layout.addView(etId); 
        layout.addView(etMax); layout.addView(cbFriends);

        new AlertDialog.Builder(context)
            .setTitle("Создать комнату")
            .setView(layout)
            .setPositiveButton("Запустить", (d, w) -> {
                // Логика запуска сервера прямо на телефоне
            }).show();
    }
}

