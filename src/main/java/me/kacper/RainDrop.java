package me.kacper;

import me.kacper.frame.Frame;

public class RainDrop {

    private final static Frame frame;

    static {
        frame = new Frame("RainDrop", 500, 500);
    }

    public static void main(String[] args) {

        frame.init();
    }
}
