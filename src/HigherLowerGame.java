import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;

public class HigherLowerGame extends JFrame{
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JLabel instructionLabel;
    private JLabel userFeedbackLabel;
    private JTextField userGuessTextField;
    private JButton guessButton;
    private JButton playAgainButton;
    private int randomNumber;

    public HigherLowerGame(){
        initComponents();
        go();
        randomNumber = generateRandomNum()
    }

    // create and initialise all components for the gui
    private void initComponents(){
        setTitle("Higher/Lower Game");
        topPanel = new JPanel();
        mainPanel = new JPanel();
        bottomPanel = new JPanel();
        instructionLabel = new JLabel("Please enter your guess: (1- 100)");
        instructionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        userGuessTextField = new JTextField();
        userGuessTextField.setColumns(3);
        guessButton = new JButton("Guess!");
        playAgainButton = new JButton("Play Again");
        userFeedbackLabel = new JLabel();


        getContentPane().add(BorderLayout.NORTH, topPanel);
        topPanel.add(instructionLabel);

        getContentPane().add(mainPanel);
        mainPanel.add(userGuessTextField);
        mainPanel.add(guessButton);
        mainPanel.add(playAgainButton);

        getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        bottomPanel.add(userFeedbackLabel);

        guessButton.addActionListener(e -> guessButtonActionPerformed());
        userGuessTextField.addActionListener(e -> guessButtonActionPerformed());
        playAgainButton.addActionListener(e -> playAgainButtonActionPerformed());

        // To ensure that the user can only enter three characters
        AbstractDocument userGuessDocument = (AbstractDocument) userGuessTextField.getDocument();
        userGuessDocument.setDocumentFilter(new DocumentSizeFilter(1, 3));

    }

    // Create gui and give it a size/set visible
    private void go(){
        setSize(300, 127);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    private static int generateRandomNum(){
        // To stop generation of 0
        return (int) (Math.random() * 100) + 1;
    }

    private String beginGame(int userGuess){
        String output;
        if (userGuess < 0 || userGuess > 100){
            output = "Please enter a number between 0 and 100";
        } else {
            output = (userGuess > randomNumber) ? "Too High" : (userGuess < randomNumber) ? "Too Low" : "Correct!";
        }
        return output;
    }
    private void guessButtonActionPerformed(){
        try {
            String result = beginGame((Integer.parseInt(userGuessTextField.getText())));
            if (result.equals("Correct!")){
                userFeedbackLabel.setText(result);
                userFeedbackLabel.setForeground(Color.GREEN);
                guessButton.setEnabled(false);
                userGuessTextField.setEnabled(false);
            } else {
                userFeedbackLabel.setText(result);
                userFeedbackLabel.setForeground(Color.RED);
            }
        } catch (NumberFormatException numberFormatException){
            userFeedbackLabel.setForeground(Color.RED);
            userFeedbackLabel.setText("Please enter a valid number");
        }
    }
    private void playAgainButtonActionPerformed(){
        randomNumber = generateRandomNum();
        guessButton.setEnabled(true);
        userGuessTextField.setEnabled(true);
        userGuessTextField.setText("");
    }
}
