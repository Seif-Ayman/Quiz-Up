package GUI;

public class Main {

    public static void main(String[] args) {
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setTitle("Login");
        LoginFrame.setResizable(false);
    }
    
}
