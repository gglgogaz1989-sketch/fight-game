package com.fightgame.core.ui;
import android.graphics.*;
import com.fightgame.core.graphics.Assets;

public class Joystick {
    public float x, y, stickX, stickY;
    public boolean active = false;

    public Joystick(float x, float y) { this.x = x; this.y = y; }

    public void draw(Canvas canvas) {
        // 0,0 - покой, 16,0 - актив (смотрит вверх)
        Rect src = active ? new Rect(16, 0, 32, 16) : new Rect(0, 0, 16, 16);
        Rect dst = new Rect((int)x-100, (int)y-100, (int)x+100, (int)y+100);

        if (active) {
            float angle = (float) Math.toDegrees(Math.atan2(stickY - y, stickX - x)) + 90;
            canvas.save();
            canvas.rotate(angle, x, y);
            canvas.drawBitmap(Assets.joystick, src, dst, null);
            canvas.restore();
        } else {
            canvas.drawBitmap(Assets.joystick, src, dst, null);
        }
    }
}

