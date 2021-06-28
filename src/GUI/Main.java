package GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JFrame teste = new JanelaCadastro();
        teste.setVisible(true);
    }
}