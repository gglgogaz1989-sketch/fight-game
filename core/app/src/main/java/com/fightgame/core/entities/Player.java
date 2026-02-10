package com.fightgame.core;

import android.graphics.*;

public class Player {
    public float x = 200, y = 200;
    public int hp = 100;
    private Bitmap sheet;
    private int frame = 0; // Текущий кадр анимации

    public Player(Bitmap sheet) {
        this.sheet = sheet;
    }

    public void draw(Canvas canvas, Paint paint) {
        // Вырезаем первый кадр 16x16 (0,0,16,16)
        Rect src = new Rect(frame * 16, 0, (frame + 1) * 16, 16);
        // Рисуем на экране (растягиваем до 128x128 для видимости)
        Rect dst = new Rect((int)x, (int)y, (int)x + 128, (int)y + 128);
        canvas.drawBitmap(sheet, src, dst, paint);
    }
}


