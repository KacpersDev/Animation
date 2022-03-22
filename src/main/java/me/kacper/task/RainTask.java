package me.kacper.task;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@Getter
public class RainTask {
    
    private final JLabel label;
    private final Timer timer;
    private final JFrame frame;
    private final Random random;

    public RainTask(JFrame frame, JLabel label) {
        this.label = label;
        this.frame = frame;
        this.timer = new Timer();
        this.random = new Random();
    }
    
    public void init(){

        timer.schedule(new TimerTask() {

            int timer = 2;

            @Override
            public void run() {

                timer--;

                if (timer <= 0) {
                    timer = 2;
                }

                int delta = random.nextInt(500);

                label.setLocation(delta, (int) (label.getLocation().getY() + 5));

                if (label.getLocation().getY() == 505) {
                    label.setLocation((int)label.getLocation().getX(), 5);
                }

            }
        },0L,20L);
    }
}
