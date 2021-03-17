import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;

//TODO event handling code for no input or inputs that are over boundaries. Let the user play again!

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
        randomNumber = generateRandomNum();
    }

    // create and initialise all components for the gui
    public void initComponents(){
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

        // To ensure that the user can only enter three characters
        AbstractDocument userGuessDocument = (AbstractDocument) userGuessTextField.getDocument();
        userGuessDocument.setDocumentFilter(new DocumentSizeFilter(1, 3));

    }

    // Create gui and give it a size/set visible
    public void go(){
        setSize(300, 127);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public static int generateRandomNum(){
        return (int) (Math.random() * 101);
    }

    public String beginGame(int userGuess){
        String output = (userGuess > randomNumber) ? "Too High" : (userGuess < randomNumber) ? "Too Low" : "Correct!";

        if (output.equals("Correct!")){
            System.out.println(output);
            return output;
        } else {
            System.out.println(output);
            return output;
        }
    }
    public void guessButtonActionPerformed(){
        String result = beginGame((Integer.parseInt(userGuessTextField.getText())));
        if (result.equals("Correct!")){
            userFeedbackLabel.setText(result);
            userFeedbackLabel.setForeground(Color.GREEN);
            guessButton.setEnabled(false);
        } else {
            userFeedbackLabel.setText(result);
            userFeedbackLabel.setForeground(Color.RED);
        }
    }
}
