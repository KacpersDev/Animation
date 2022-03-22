package me.kacper.frame;

import lombok.Getter;
import me.kacper.task.RainTask;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Getter
public class Frame {

    private final String title;
    private final int width;
    private final int height;
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel label;
    private final RainTask rainTask;
    private final RainTask rainTask1;
    private final JLabel label1;
    private final Random random;

    public Frame(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
        this.frame = new JFrame(this.title);
        this.panel = new JPanel();
        this.label = new JLabel();
        this.label1 = new JLabel();
        this.rainTask = new RainTask(this.frame, this.label);
        this.rainTask1 = new RainTask(this.frame, this.label1);
        this.random = new Random();
    }

    public void init(){

        int delta1 = random.nextInt(500);
        int delta2 = random.nextInt(500);

        if (delta1 == delta2) { return; }

        label.setBounds(delta1,0,5,10);
        label.setBackground(Color.cyan);
        label.setOpaque(true);

        label1.setBounds(delta2,0, 5, 10);
        label1.setBackground(Color.blue);
        label1.setOpaque(true);
        panel.setBackground(Color.BLACK);
        frame.add(this.label);
        frame.add(this.label1);
        this.frame.add(panel);
        this.frame.setSize(this.width, this.height);
        this.frame.setVisible(true);
        rainTask.init();
        rainTask1.init();
    }
}
