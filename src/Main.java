import javax.swing.*;
import java.awt.*;

public class Main {
    private static JFrame frame;

    private static JLabel heading;
    private static JLabel subheading;
    private static JButton citiesButton;
    private static JButton factoriesButton;
    private static JButton randomButton;

    private static JButton nextButton;
    private static JRadioButton option1;
    private static JRadioButton option2;
    private static JRadioButton option3;
    private static JRadioButton option4;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        heading = new JLabel("Vítej na zkoušení ze zeměpisu!");
        heading.setBounds(50,50,screenSize.width,30);
        subheading = new JLabel("Vyber si mód:");
        subheading.setBounds(50,80,screenSize.width,30);
        citiesButton = new JButton("Města k podnikům");
        citiesButton.setBounds(50,250,200,50);
        factoriesButton = new JButton("Podniky k městům");
        factoriesButton.setBounds(50,150,200,50);
        randomButton = new JButton("Náhodně");
        randomButton.setBounds(50,350,200,50);

        nextButton = new JButton("next");
        nextButton.setBounds(350,350,100,50);
        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();

        displayStartScreen();
        citiesButton.addActionListener((actionEvent)->displayCitiesQuestions());
        factoriesButton.addActionListener((actionEvent)->displayFactoriesQuestions());
        citiesButton.addActionListener((actionEvent)->displayRandomQuestions());
    }
    private static void displayFactoriesQuestions(){

    }

    private static void displayRandomQuestions(){
    }
    private static void displayCitiesQuestions(){

    }
    private static void displayStartScreen(){
        frame.add(heading);
        frame.add(subheading);
        frame.add(citiesButton);
        frame.add(factoriesButton);
        frame.add(randomButton);

        heading.setText("Vítej na zkoušení ze zeměpisu!");
        subheading.setText("Vyber si mód:");

        frame.remove(nextButton);
        frame.remove(option1);
        frame.remove(option2);
        frame.remove(option3);
        frame.remove(option4);

    }
    private static void displayEndScreen(){

    }
    private static void displayQuestion(){
        frame.add(nextButton);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(option4);

        nextButton.setText("next");
    }
}
