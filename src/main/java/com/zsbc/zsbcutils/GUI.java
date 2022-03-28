package com.zsbc.zsbcutils;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class GUI {

    /*
    WORK IN PROGRESS
     */

    private HashMap<String, JPanel> guiSections;

    private int guiWidth;
    private int guiHeight;
    private String guiTitle;
    private JPanel panel;
    private JFrame frame;

    public GUI(String guiTitle, int guiWidth, int guiHeight) {
        this.guiWidth = guiWidth;
        this.guiHeight = guiHeight;
        this.guiSections = new HashMap<>();
        this.guiTitle = guiTitle;
        this.panel = new JPanel();
        this.frame = new JFrame(guiTitle);


        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        frame.add(panel);
    }

    public void addGUISection(String name, JPanel panel, int x, int y, int width, int height, Color color) {
        panel.setLayout(null);
        panel.setBackground(color);
        panel.setBounds(x, y, width, height);
        frame.add(panel);
        guiSections.put(name, panel);
    }

    public void open(boolean isResizable) {
        frame.setSize(guiWidth, guiHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(isResizable);
        frame.setVisible(true);
    }
}
