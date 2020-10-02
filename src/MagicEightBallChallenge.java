import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MagicEightBallChallenge extends JFrame{
    // Component declaration
    private JPanel mainPanel;
    private JPanel topPanel;
    private JLabel instructionLabel;
    private JLabel eightBallAnswerLabel;
    private JTextField userQuestionField;
    private JButton askButton;
    private JButton clearButton;
    private JButton playAgainButton;
    private JButton quitButton;

    private static final String[] responses = {"Yes", "No", "Maybe", "Perhaps", "I am unsure",
            "Wait another day, then ask again", "Cannot predict now", "Most Likely", "Definitely", "You may rely on it",
            "Almost certainly", "Definitely", "Never", "Definitely not"};

    public MagicEightBallChallenge(){
        initComponents();
        go();
    }

    // Set up all components of the GUI and add button action listeners
    private void initComponents(){
        setTitle("Magic Eight Ball challenge");
        mainPanel = new JPanel();
        topPanel = new JPanel();
        instructionLabel = new JLabel("Ask the eight ball a question!");
        instructionLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        eightBallAnswerLabel = new JLabel();
        eightBallAnswerLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        userQuestionField = new JTextField();
        userQuestionField.setColumns(25);
        askButton = new JButton("Ask");
        clearButton = new JButton("Clear");
        playAgainButton = new JButton("Play Again");
        quitButton = new JButton("Quit");

        getContentPane().add(BorderLayout.NORTH, topPanel);
        topPanel.add(instructionLabel);
        getContentPane().add(mainPanel);

        mainPanel.add(userQuestionField);
        mainPanel.add(askButton);
        mainPanel.add(clearButton);
        mainPanel.add(playAgainButton);
        mainPanel.add(quitButton);
        mainPanel.add(eightBallAnswerLabel);

        askButton.addActionListener(e -> askButtonActionPerformed());

        clearButton.addActionListener(e -> clearButtonActionPerformed());

        playAgainButton.addActionListener(e -> playAgainButtonActionPerformed());

        quitButton.addActionListener(e -> quitButtonActionPerformed());
    }

    // Simulate thinking of eight ball by starting new thread with sleep function
    private void askTheEightBall() {
        eightBallAnswerLabel.setText("Thinking...");

        MyThread thread = new MyThread();
        thread.start();
    }

    // Display GUI
    private void go(){
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    // Simulate computer thinking before choosing a response
    private class MyThread extends Thread{
        @Override
        public void run(){
            try {
                TimeUnit.SECONDS.sleep(3);
                int response = (int) (Math.random() * responses.length);
                eightBallAnswerLabel.setText(responses[response]);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    // Action Listeners methods
    private void askButtonActionPerformed(){
        askTheEightBall();
    }

    private void clearButtonActionPerformed(){
        userQuestionField.setText("");
    }

    private void playAgainButtonActionPerformed(){
        askTheEightBall();
    }

    private void quitButtonActionPerformed(){
        dispose();
    }

}
