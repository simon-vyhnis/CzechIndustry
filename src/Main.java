import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JLabel heading = new JLabel("Vítej na zkoušení ze zeměpisu!");
        heading.setBounds(50,50,screenSize.width,30);
        JLabel subheading = new JLabel("Vyber si mód:");
        subheading.setBounds(50,80,screenSize.width,30);
        JButton citiesButton = new JButton("Města k podnikům");
        citiesButton.setBounds(50,250,200,50);
        JButton factoriesButton = new JButton("Podniky k městům");
        factoriesButton.setBounds(50,150,200,50);
        JButton randomButton = new JButton("Náhodně");
        randomButton.setBounds(50,350,200,50);
        frame.add(heading);
        frame.add(subheading);
        frame.add(citiesButton);
        frame.add(factoriesButton);
        frame.add(randomButton);
        citiesButton.addActionListener((actionEvent)->displayCitiesQuestions());
        factoriesButton.addActionListener((actionEvent)->displayFactoriesQuestions());
        citiesButton.addActionListener((actionEvent)->displayRandomQuestions());
    }
    private static void displayFactoriesQuestions() {
    }

    private static void displayRandomQuestions() {
    }
    private static void displayCitiesQuestions(){
        
    }
}
