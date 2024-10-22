//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class LOGIN {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        // Create labels and text fields
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField();

        JButton loginButton = new JButton("LOGIN");
        JLabel successLabel = new JLabel("");

        // Add action listener to the button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Simple validation
                if (username.equals("tafadzwa") && password.equals("password123")) {
                    JFrame newFrame = new JFrame("Welcome");
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setSize(300, 100);
                    newFrame.setLayout(new FlowLayout());

                    // Create label for the new frame
                    JLabel welcomeLabel = new JLabel("TAFADZWA ASHLEY KUDUMBA        REG NUMBER        H230638M");
                    newFrame.add(welcomeLabel);

                    // Make the new frame visible
                    newFrame.setVisible(true);

                    // Dispose the old frame
                    frame.dispose();
                } else {
                    successLabel.setText("Invalid username or password, try again.");
                }
            }
        });

        // Add components to the frame
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passwordLabel);
        frame.add(passwordText);
        frame.add(loginButton);
        frame.add(successLabel);

        // Make the frame visible
        frame.setVisible(true);
    }

}