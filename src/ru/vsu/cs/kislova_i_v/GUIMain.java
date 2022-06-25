package ru.vsu.cs.kislova_i_v;

import java.util.Locale;

public class GUIMain {
    public static void main(String[] args) throws Exception {
        winMain();
    }

    public static void winMain() {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(() -> new FrameMain().setVisible(true));
    }
}