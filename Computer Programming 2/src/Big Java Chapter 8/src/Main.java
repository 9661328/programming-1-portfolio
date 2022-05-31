import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Main extends javax.swing.JFrame {

    public int launchDegree, initialVelocity;
    public ArrayList<Point> coordinateArray;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public Main() {
        initComponents();

        Cannonball cannonball = new Cannonball(0);
        //ArrayList<Point> coordinateArray = cannonball.shoot(a, v, 0.1);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        launchDegreeInput = new javax.swing.JTextField();
        launchDegreeText = new javax.swing.JLabel();
        initialVelocityText = new javax.swing.JLabel();
        initialVelocityInput = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Points");
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(448, 156));
        setSize(new java.awt.Dimension(448, 156));

        launchDegreeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchDegreeInputActionPerformed(evt);
            }
        });

        launchDegreeText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        launchDegreeText.setText("Launch angle (degrees):");

        initialVelocityText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        initialVelocityText.setText("Initial velocity (m/s):");

        initialVelocityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialVelocityInputActionPerformed(evt);
            }
        });

        enterButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(initialVelocityText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(initialVelocityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(launchDegreeText, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(launchDegreeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(enterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(launchDegreeText)
                    .addComponent(launchDegreeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initialVelocityText)
                    .addComponent(initialVelocityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(enterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void launchDegreeInputActionPerformed(java.awt.event.ActionEvent evt) {                                                  

    }                                                 

    private void initialVelocityInputActionPerformed(java.awt.event.ActionEvent evt) {                                                     

    }                                                    

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String d = launchDegreeInput.getText();
        String v = initialVelocityInput.getText();
        int degree, velocity;

        try {
            degree = Integer.parseInt(d);
            velocity = Integer.parseInt(v);

            Cannonball cannonball = new Cannonball(0);
            coordinateArray = cannonball.shoot(degree, velocity, 0.1);
            
            JFrame f = new JFrame("Points");
            f.setSize(500, 500);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(false);

            PointPanel p = new PointPanel(coordinateArray);
            f.add(p);
        } catch (NumberFormatException e) {
            launchDegreeInput.setText("");
            initialVelocityInput.setText("");
        }


    }                                           

    // Variables declaration - do not modify                     
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField initialVelocityInput;
    private javax.swing.JLabel initialVelocityText;
    private javax.swing.JTextField launchDegreeInput;
    private javax.swing.JLabel launchDegreeText;
    // End of variables declaration                   
}