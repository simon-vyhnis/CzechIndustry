import javax.swing.*;
import java.awt.*;

public class Main {
    private static JFrame frame;

    private static JLabel heading;
    private static JLabel subheading;
    private static JButton citiesButton;
    private static JButton factoriesButton;
    private static JButton homeButton;

    private static JButton nextButton;

    private static Data data;

    private static final int STATUS_START_OR_END = 0;
    private static final int ANSWERING = 1;
    private static final int ANSWERED = 2;

    private static int uiStatus = STATUS_START_OR_END;
    private static boolean displayingCities;
    private static Factory currentFactory;

    public static void main(String[] args) {
        frame = new JFrame("Zkoušení ze zeměpisu");
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        heading = new JLabel("Vítej na zkoušení ze zeměpisu!");
        heading.setBounds(50,50,screenSize.width,30);
        subheading = new JLabel("Vyber si mód:");
        subheading.setBounds(50,80,screenSize.width,30);
        citiesButton = new JButton("Zobrazovat města");
        citiesButton.setBounds(50,250,200,50);
        factoriesButton = new JButton("Zobrazovat podniky");
        factoriesButton.setBounds(50,150,200,50);
        nextButton = new JButton("Next");
        nextButton.setBounds(350,350,100,50);
        homeButton = new JButton("Home");
        homeButton.setBounds(50,350,100,50);

        displayStartScreen();
        citiesButton.addActionListener((actionEvent)->displayCitiesQuestions());
        factoriesButton.addActionListener((actionEvent)->displayFactoriesQuestions());
        homeButton.addActionListener((actionEvent)->displayStartScreen());

        nextButton.addActionListener((actionEvent)->{
            System.out.println(uiStatus);
            switch (uiStatus) {
                case(ANSWERED):
                    if(displayingCities){
                        displayCitiesQuestions();
                    }else{
                        displayFactoriesQuestions();
                    }
                    break;
                case(ANSWERING):
                    displayResult();
                    break;
                case(STATUS_START_OR_END):
                    displayStartScreen();
                    break;
            }
        });

        data = new Data();
    }
    private static void displayFactoriesQuestions(){
        displayingCities = false;
        currentFactory = data.getRandomFactory();
        heading.setText(currentFactory.getName());
        displayQuestion();
    }

    private static void displayCitiesQuestions(){
        displayingCities = true;
        currentFactory = data.getRandomFactory();
        heading.setText(currentFactory.getCity());
        displayQuestion();

    }
    private static void displayStartScreen(){
        frame.add(heading);
        frame.add(subheading);
        frame.add(citiesButton);
        frame.add(factoriesButton);

        heading.setText("Vítej na zkoušení ze zeměpisu!");
        subheading.setText("Vyber si mód:");

        frame.remove(nextButton);
        frame.remove(homeButton);
        frame.repaint();

    }
    private static void displayQuestion(){
        uiStatus = ANSWERING;
        frame.add(nextButton);
        frame.add(homeButton);

        frame.remove(citiesButton);
        frame.remove(factoriesButton);
        frame.remove(subheading);

        nextButton.setText("Next");

        frame.repaint();

    }
    private static void displayResult(){
        uiStatus = ANSWERED;
        frame.add(subheading);
        if(displayingCities) {
            subheading.setText(currentFactory.getName() + " (" + currentFactory.getIndustryType() + ")");
        }else {
            subheading.setText(currentFactory.getCity());
        }
        frame.repaint();
    }

}
