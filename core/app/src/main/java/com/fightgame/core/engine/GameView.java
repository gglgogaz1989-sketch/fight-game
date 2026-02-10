package com.fightgame.core.engine;

import android.content.Context;
import android.graphics.*;
import android.view.SurfaceView;
import com.fightgame.core.entities.Player;
import com.fightgame.core.ui.Joystick;

public class GameView extends SurfaceView implements Runnable {
    private Player player;
    private Joystick joystick;
    private int[][] map = {
        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
        {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
        {2, 0, 0, 1, 1, 1, 3, 0, 0, 2},
        {2, 0, 1, 1, 1, 1, 3, 0, 0, 2},
        {2, 1, 1, 1, 1, 1, 1, 1, 1, 2},
        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}
    };

    public GameView(Context context, Bitmap heroBmp, Bitmap tilesBmp, Bitmap joyBmp) {
        super(context);
        this.player = new Player(heroBmp);
        this.joystick = new Joystick(joyBmp, 300, 800);
    }

    // Тут будет цикл run() с отрисовкой всех элементов
}

