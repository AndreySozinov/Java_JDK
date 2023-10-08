package ru.savrey.lection02.circles;

import ru.savrey.lection02.common.CanvasRepaintListener;
import ru.savrey.lection02.common.Interactable;
import ru.savrey.lection02.common.MainCanvas;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame implements CanvasRepaintListener {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private final Interactable[] interactables = new Interactable[10];
    private static final Background background = new Background();

    private MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");

        for (int i = 0; i < interactables.length; i++) {
            interactables[i] = new Ball();
        }

        MainCanvas canvas = new MainCanvas(this);
        add(canvas);
        setVisible(true);
    }

    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(MainCanvas canvas, float deltaTime) {
        for (Interactable ball : interactables) {
            ball.update(canvas, deltaTime);
        }
        background.update(canvas, deltaTime);
    }
    private void render(MainCanvas canvas, Graphics g) {
        for (Interactable ball : interactables) {
            ball.render(canvas, g);
        }
        background.render(canvas, g);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
