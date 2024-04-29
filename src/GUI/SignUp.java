package GUI;
import Controls.SignUpControl;
import java.awt.Color;
import java.io.FileWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    private SignUpControl signupcontrol = new SignUpControl();

   
    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NameError = new javax.swing.JLabel();
        EmailError = new javax.swing.JLabel();
        PassError = new javax.swing.JLabel();
        InvalidInputs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\salem\\OneDrive\\Documents\\NetBeansProjects\\LoginAndRegister\\src\\Images\\Logo.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quiz Up!");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quiz Up!");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quiz Up!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Register");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 10, 150, 48);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Full Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 80, 100, 25);

        NameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NameField.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(NameField);
        NameField.setBounds(440, 110, 330, 35);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 170, 100, 25);

        EmailField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmailField.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(EmailField);
        EmailField.setBounds(440, 200, 330, 35);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(440, 260, 100, 25);

        PassField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PassField.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(PassField);
        PassField.setBounds(440, 290, 330, 35);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 410, 330, 35);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(440, 370, 330, 35);

        NameError.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(NameError);
        NameError.setBounds(440, 150, 330, 0);
        NameError.setVisible(false);

        EmailError.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(EmailError);
        EmailError.setBounds(440, 240, 330, 0);
        EmailError.setVisible(false);

        PassError.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(PassError);
        PassError.setBounds(440, 330, 330, 0);
        PassError.setVisible(false);

        InvalidInputs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InvalidInputs.setForeground(new java.awt.Color(255, 51, 51));
        InvalidInputs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(InvalidInputs);
        InvalidInputs.setBounds(440, 450, 330, 20);
        InvalidInputs.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setTitle("Login");
        LoginFrame.setResizable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  // Get user input
  String name = NameField.getText();
  String email = EmailField.getText();
  String password = new String(PassField.getPassword());

  // Reset error messages (assuming error labels exist)
  NameError.setVisible(false);
  EmailError.setVisible(false);
  PassError.setVisible(false);

  // Check for empty fields
  boolean hasEmptyField = false;
  if (name.isEmpty()) {

    hasEmptyField = true;
  }
  if (email.isEmpty()) {

    hasEmptyField = true;
  }
  if (password.isEmpty()) {

    hasEmptyField = true;
  }

  if (hasEmptyField){
    if (NameField.getText().equals("")) {
        NameError.setText("please enter your fullname !");
        NameError.setVisible(true);
  }
    if (email.isEmpty()) {
        
  }
    if (password.isEmpty()) {
        
  }
        InvalidInputs.setText("Empty input found !");
        InvalidInputs.setVisible(true);
  }
  if (!hasEmptyField) {
      boolean IsInvalid=false;
    if (!signupcontrol.validateName(name) || !signupcontrol.validateEmail(email) || !signupcontrol.validatePassword(password)) {
      // Handle individual validation failures (optional)
      if (!signupcontrol.validateName(name)) {

        IsInvalid=true;
      }
      if (!signupcontrol.validateEmail(email)) {

        IsInvalid=true;
      }
      if (!signupcontrol.validatePassword(password)) {
        IsInvalid=true;
      }


    }

    if(IsInvalid){
        InvalidInputs.setText("Invalid inputs !");
        InvalidInputs.setVisible(true);
    }else{
            try {
      FileWriter writer = new FileWriter("Users.txt", true);
      writer.write(name + " " + email + " " + password);
      writer.write(System.getProperty("line.separator"));
      writer.close();
      JOptionPane.showMessageDialog(null, "Signup successful!");
    } catch (Exception e) {
      // Handle exception during file writing
      e.printStackTrace(); // For debugging purposes
      JOptionPane.showMessageDialog(null, "Error during signup!");
    }
    }

  }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailError;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel InvalidInputs;
    private javax.swing.JLabel NameError;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel PassError;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
