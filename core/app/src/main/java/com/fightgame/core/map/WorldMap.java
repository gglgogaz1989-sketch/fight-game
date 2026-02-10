package com.fightgame.core.map;
import android.graphics.*;
import com.fightgame.core.graphics.Assets;

public class WorldMap {
    private int[][] grid = {
        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
        {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
        {2, 0, 0, 0, 2, 0, 0, 2, 0, 0, 1, 1, 1, 3},
        {2, 0, 0, 0, 3, 3, 1, 3, 1, 1, 1, 3, 3, 3},
        {3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 2},
        {3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2}
    };

    public void draw(Canvas canvas) {
        int size = 80; // масштаб блока на экране
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int type = grid[r][c];
                Rect src = new Rect((type%2)*16, (type/2)*16, (type%2)*16+16, (type/2)*16+16);
                Rect dst = new Rect(c*size, r*size, (c+1)*size, (r+1)*size);
                canvas.drawBitmap(Assets.tiles, src, dst, null);
            }
        }
    }
}

