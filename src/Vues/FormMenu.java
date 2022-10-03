package Vues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class FormMenu extends JFrame{
    private JLabel lblTrain;
    private JLabel lblCasquette;
    private JLabel lblValider;
    private JPanel pnlRoot;

    public FormMenu(){

        this.setTitle("Inscription");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        // IMAGES

        ImageIcon imageIcon = new ImageIcon(
                new ImageIcon(getClass().getResource("/Images/train.jpg"))
                        .getImage().getScaledInstance(400,200, Image.SCALE_DEFAULT));
        lblTrain.setIcon(imageIcon);

        ImageIcon imageIcon1 = new ImageIcon(
                new ImageIcon(getClass().getResource("/Images/casquette.jpg"))
                        .getImage().getScaledInstance(200, 100 , Image.SCALE_DEFAULT));
        lblCasquette.setIcon(imageIcon1);

        ImageIcon imageIcon2 = new ImageIcon(
                new ImageIcon(getClass().getResource("/Images/Valider.jpg"))
                        .getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
        lblValider.setIcon(imageIcon2);

        //--------------------------------
        lblTrain.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FormInscription form = null;
                try {
                    form = new FormInscription();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                form.setVisible(true);
            }
        });
    }

}
