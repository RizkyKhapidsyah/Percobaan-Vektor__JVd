package com.rk;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class PercobaanVektor extends JFrame {

    public static void main(String[] args) {
        new PercobaanVektor();
    }

    Vector vk;

    PercobaanVektor() {
        vk = new Vector();
        vk.add("Testing Vektor");
        vk.addElement("Coba Tambahkan Lagi");

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        setTitle("Test Vector");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Jumlah Elemen Vektor   : " + String.valueOf(vk.size()), 10, 50);
        g.drawString("Element Vektor Ke-0    : " + vk.elementAt(0), 10, 100);
        g.drawString("Element Vektor Ke-1    : " + vk.elementAt(1), 10, 150);
        g.drawString("Element Pertama        : " + vk.firstElement(), 10, 200);
        g.drawString("Element Terakhir       : " + vk.lastElement(), 10, 250);
        g.drawString("Method isEmpty         : " + vk.isEmpty(), 10, 300);
        vk.clear();
        g.drawString("Method isEmpty         : " + vk.isEmpty(), 10, 350);
    }
}
