package ru.mirea.task8.num2;



import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("C:\\Users\\-vlad\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\image3.PNG").getImage();
        g.drawImage(image, 3, 4, this);
    }

}
