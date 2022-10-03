package Vues;

import Controlleurs.CtrlActivte;
import Controlleurs.CtrlFormation;
import Tools.ConnexionBDD;
import Tools.ModelJTable;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class FormInscription extends FormMenu  {


    private JTable tblActivites;
    private JTable tblAgents;
    private JTable tblFormation;
    private JButton btnInscrire;
    private JPanel pnlInscription;
    private JLabel lblNonInscrits;
    private JLabel lblFormations;
    private JLabel lstActivites;
    private ConnexionBDD maCnx;
    private ModelJTable mdlActi;
    private CtrlActivte ctrlActi;
    private CtrlFormation ctrlForma;

    public FormInscription() throws SQLException, ClassNotFoundException{
        this.setTitle("Inscription");
        this.setContentPane(pnlInscription);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        maCnx = new ConnexionBDD();

        mdlActi = new ModelJTable();
        ctrlActi = new CtrlActivte();
        mdlActi.LoadDatasActivite(ctrlActi.getAllActivite());
        tblActivites.setModel(mdlActi);


        tblActivites.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ctrlForma = new CtrlFormation();
                mdlActi = new ModelJTable();
                int numeroActi = Integer.parseInt(tblActivites.getValueAt(tblActivites.getSelectedRow(),0).toString());
                try {
                    mdlActi.LoadDatasFormation(ctrlForma.getFormationByIdActivite(numeroActi));
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                tblFormation.setModel(mdlActi);

            }
        });
    }
}
