package mc;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import mc.drawing.GraphicalMain;

public class GraphicalLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("MazeRunner");
        config.setForegroundFPS(50);
        config.setWindowedMode(1200, 1200);

        new Lwjgl3Application(new GraphicalMain(), config);
    }
}
