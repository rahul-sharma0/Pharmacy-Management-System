
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class startup extends javax.swing.JFrame {

    pbThead t1;
    
    
    /**
     * Creates new form startup
     */
    public startup() {
        initComponents();
        
        t1= new pbThead (jProgressBar1);
        t1.start();
    }
        
    class pbThead extends Thread
    {
        JProgressBar pbar;

        pbThead(JProgressBar pbar) 
        {
            pbar = jProgressBar1;
        }
        
        public void run()
        {
            int min = 0;
            int max  = 100;
             
            jProgressBar1.setMinimum(min);
            jProgressBar1.setMaximum(max);
            jProgressBar1.setValue(0);
         
            
            for(int i=min; i<=max; i++)
            {
                jProgressBar1.setValue(i);
                
                if(i >=5 && i <= 35)
                {
                    jLabel2.setText("Turning on modules...");
                }
                else if (i>= 40 && i<= 65)
                {
                    jLabel2.setText("Loading modules...");
                }
                
                else if (i>=70 && i<= 85)
                {
                    jLabel2.setText("Starting modules...");
                }
                else if( i>= 86 && i<=100 )
                {
                    jLabel2.setText("Initializing components...");
                }
                else 
                {
                    jLabel2.setText("");
                }
            
                try {
                    sleep(123);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                
            }
            new Login().setVisible(true);
            setVisible(false);
            
        }
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("hello");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 330, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharmacy-with-doctor-in-counter-drugstore-cartoon-character-design-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 469));

        jProgressBar1.setValue(50);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 693, 10));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
