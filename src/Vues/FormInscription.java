package Vues;

import javax.swing.*;

public class FormInscription extends FormMenu {


    private JTable tblActivites;
    private JTable tblAgents;
    private JTable tblFormation;
    private JButton btnInscrire;
    private JPanel pnlInscription;

    public FormInscription(){
        this.setTitle("Inscription");
        this.setContentPane(pnlInscription);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
