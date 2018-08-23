package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel panel;
    private JLabel inputCharactersLabel;
    private JTextField inputCharactersField;
    private JLabel showCharacterCountLabel;

    private String EMPTY_INPUT = "No input string yet.";
    private String template = "'%s' has %d characters";


    public MainFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 400);

        panel = new JPanel();
        inputCharactersField = new JTextField(10);

        inputCharactersLabel = new JLabel("What is your input string?");
        showCharacterCountLabel = new JLabel(EMPTY_INPUT);

        panel.add(inputCharactersLabel);
        panel.add(inputCharactersField);
        panel.add(showCharacterCountLabel);

        this.add(panel);

        inputCharactersField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCharacterCount();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCharacterCount();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCharacterCount();
            }
        });
    }

    private void updateCharacterCount() {
        String input = inputCharactersField.getText();
        if (input.length() <= 0) {
            showCharacterCountLabel.setText(EMPTY_INPUT);
        } else {
            showCharacterCountLabel.setText(String.format(template, input, input.length()));
        }
    }
}
