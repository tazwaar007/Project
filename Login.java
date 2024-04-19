import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class Login {
    JFrame frame;
    private JPanel logoPanel, signUpPanel;
    private BufferedImage image;
    private ImageIcon favIcon;
    private JLabel bgColor;
    private JLabel aiubLogo;
    private JLabel logo;
    private JLabel taglineText;
    private JLabel aiubText;
    private JLabel loginText;
    private JLabel loginContainerBg;
    private JLabel aiubIdLabel;
    private JTextField aiubIdField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton forgotPasswordButton;
    private JLabel signupText;
    private JButton signupButton;
    private JCheckBox isDonorLogin;

    public Login() {
        frame = new JFrame("Login page Patient - Doctor Co");

        // // favIcon
        // try {
        //     favIcon = new ImageIcon("DOC.jpg");
        //     frame.setIconImage(favIcon.getImage());
        // } catch (Exception e) {
        // }

        // frame background
        bgColor = new JLabel("");
        bgColor.setOpaque(true);
        bgColor.setBounds(0, 0, 1366, 768);
        bgColor.setBackground(Color.WHITE);
        //bgColor.setBackground(Color.decode("#008080")); // Teal color


        // logo panel
        logoPanel = new JPanel();
        logoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, -10, 0));
        logoPanel.setBounds(0, 200, 680, 250);
        logoPanel.setBackground(Color.WHITE);

        // // aiub and blood logo
        // try {
        //     image = ImageIO.read(new File("aiub_logo.png"));
        //     aiubLogo = new JLabel(new ImageIcon(image));
        //     logoPanel.add(aiubLogo);
        // } catch (Exception e) {
        // }

        // try {
        //     image = ImageIO.read(new File("logo.png"));
        //     logo = new JLabel(new ImageIcon(image));
        //     logoPanel.add(logo);
        // } catch (Exception e) {
        // }

        // aiub text
        aiubText = new JLabel("Patient Doctor Consultation", SwingConstants.CENTER);
        aiubText.setBounds(0, 320, 680, 300);
        aiubText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        aiubText.setForeground(Color.BLACK);

        // // tagline text
        // taglineText = new JLabel("Donate Blood, Save Life.", SwingConstants.CENTER);
        // taglineText.setBounds(0, 370, 680, 300);
        // taglineText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        // taglineText.setForeground(Color.RED);

        // login container bg
        loginContainerBg = new JLabel("");
        loginContainerBg.setOpaque(true);
        loginContainerBg.setBounds(680, 100, 980, 335);
        //loginContainerBg.setBackground(Color.GRAY);
        loginContainerBg.setBackground(Color.decode("#008080")); // Teal color


        // // login text
        // loginText = new JLabel("Login");
        // loginText.setBounds(800, 80, 500, 50);
        // loginText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        // loginText.setForeground(Color.WHITE);

       // AIUB ID field and label
    aiubIdLabel = new JLabel("User Name: ");
    aiubIdLabel.setBounds(800, 210, 190, 30);
    aiubIdLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
    aiubIdLabel.setForeground(Color.WHITE);

    aiubIdField = new JTextField("");
    aiubIdField.setBounds(960, 210, 325, 30);
    aiubIdField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));

    // Password label and field
    passwordLabel = new JLabel("Password: ");
    passwordLabel.setBounds(800, 250, 190, 30);
    passwordLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
    passwordLabel.setForeground(Color.WHITE);

    passwordField = new JPasswordField("");
    passwordField.setBounds(960, 250, 325, 30);
    passwordField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));

// Show Password checkbox
JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
showPasswordCheckBox.setBounds(960, 290, 190, 30);
showPasswordCheckBox.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
showPasswordCheckBox.setForeground(Color.WHITE);
showPasswordCheckBox.setOpaque(false); // Make it transparent
showPasswordCheckBox.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (showPasswordCheckBox.isSelected()) {
            passwordField.setEchoChar((char) 0); // Show password
        } else {
            passwordField.setEchoChar('\u2022'); // Hide password
        }
    }
});

        // // is donor login
        // isDonorLogin = new JCheckBox("Are you a Donor?");
        // isDonorLogin.setBounds(800, 375, 500, 30);
        // isDonorLogin.setForeground(Color.WHITE);
        // isDonorLogin.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        // isDonorLogin.setContentAreaFilled(false);
        // isDonorLogin.setBorderPainted(false);
        // isDonorLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                // login button
    loginButton = new JButton("Login");
    loginButton.setBounds(960, 340, 120, 40); // Adjusted the width to 200
    loginButton.setBackground(Color.BLUE); // Changed the background color to blue
    loginButton.setForeground(Color.RED); // Changed the text color to red
    loginButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
    loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        // forgot password button
        forgotPasswordButton = new JButton("Forgot Password?");
        forgotPasswordButton.setBounds(880, 510, 300, 30);
        forgotPasswordButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        forgotPasswordButton.setForeground(Color.BLACK);
        forgotPasswordButton.setContentAreaFilled(false);
        forgotPasswordButton.setBorderPainted(false);
        forgotPasswordButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // sign up panel
        signUpPanel = new JPanel();
        signUpPanel.setLayout(new FlowLayout(FlowLayout.CENTER, -10, 0));
        signUpPanel.setBounds(680, 540, 980, 150);
        //signUpPanel.setBackground(Color.GRAY);
        signUpPanel.setBackground(Color.decode("#008080"));


        signupText = new JLabel("Not Registered?");
        signupText.setForeground(Color.WHITE);
        signupText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        signupButton = new JButton("Register");
        signupButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        signupButton.setForeground(Color.BLACK);
        signupButton.setOpaque(false);
        signupButton.setContentAreaFilled(false);
        signupButton.setBorderPainted(false);
        signupButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // signup panel adding
        signUpPanel.add(signupText);
        signUpPanel.add(signupButton);

        // adding
        frame.add(logoPanel);
        frame.add(aiubText);
       // frame.add(taglineText);
       // frame.add(loginText);
        //frame.add(isDonorLogin);
        frame.add(aiubIdLabel);
        frame.add(aiubIdField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(showPasswordCheckBox);

        frame.add(loginButton);
        frame.add(forgotPasswordButton);
        frame.add(signUpPanel);
        frame.add(loginContainerBg);
        frame.add(bgColor);

        // frame
        frame.setSize(1366, 768);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // action listeners

        // login action
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // take data
                String aiubId = aiubIdField.getText().trim();
                char[] password = passwordField.getPassword();
                String passwordString = new String(password);
                boolean isDonor = isDonorLogin.isSelected();

                // validation
                if (aiubId.isEmpty() || passwordString.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "<html><center><font size='5' color='red'><b>Oops!</b> It seems like some required information is missing. Please fill in all the fields to proceed. Thanks!</font></center></html>", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // For demonstration purpose, assuming successful login always
                // Redirecting based on login type
                if (isDonor) {
                    // Redirect to DonorDashboard
                } else {
                    // Redirect to RecipientDashboard
                }
            }
        });

        // forgot password action
        forgotPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                // Open ForgotPassword window
            }
        });

        // sign up action
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                // Open Signup window
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login();
            }
        });
    }
}
