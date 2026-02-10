package com.fightgame.core.graphics;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

public class Assets {
    public static Bitmap hero, tiles, font, gui, joystick;

    public static void init(Context context) throws IOException {
        hero = load(context, "hero.png");
        tiles = load(context, "tiles.png");
        font = load(context, "font.png");
        gui = load(context, "gui.png");
        joystick = load(context, "joystick.png");
    }

    private static Bitmap load(Context context, String name) throws IOException {
        return BitmapFactory.decodeStream(context.getAssets().open(name));
    }
}
