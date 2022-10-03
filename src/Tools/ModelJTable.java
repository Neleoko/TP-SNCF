package Tools;

import Entities.Activite;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel {

    private String[] colonnes;
    private Object[][] lignes;

    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    public void LoadDatasActivite(ArrayList<Activite> LesActives){
        colonnes = new String[]{"Numéro","Nom"};
        lignes = new Object[LesActives.size()][2];
        int i = 0;
        for (Activite uneActi:LesActives){
            lignes[i][0] = uneActi.getNumero();
            lignes[i][1] = uneActi.getLibelle();
            i++;
        }
        fireTableChanged(null);
    }

//    public void LoadDatasJeux(ArrayList<Jeu> LesJeux){
//        colonnes = new String[]{"Numéro","Nom"};
//        lignes = new Object[LesJeux.size()][2];
//        int i = 0;
//        for (Jeu unJeu:LesJeux){
//            lignes[i][0] = unJeu.getIdJeu();
//            lignes[i][1] = unJeu.getNomJeu();
//            i++;
//        }
//        fireTableChanged(null);
//    }
}