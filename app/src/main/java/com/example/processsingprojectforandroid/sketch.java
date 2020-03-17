package com.example.processsingprojectforandroid;

import processing.core.PApplet;

public class sketch extends PApplet {
    public void settings() {
       fullScreen();
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}