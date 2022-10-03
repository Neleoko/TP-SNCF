package Controlleurs;

import Entities.Formation;
import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlFormation {
    // Cet objet permet de récupérer les identifiants de connexion
    private Connection cnx;
    // Cet objet permet d'ecrire nos requetes sql
    private PreparedStatement ps;
    // Cet objet permet de récupérer le résultat de notre requête
    private ResultSet rs;
    public CtrlFormation() {
        cnx = ConnexionBDD.getCnx();
    }
    public ArrayList<Formation> getFormationByIdActivite(int numeroCateg) throws SQLException {
        ArrayList<Formation> lesFormations = new ArrayList<>();
        ps = cnx.prepareStatement("SELECT code , numeroActivite , intitule FROM formation WHERE numeroActivite = ?");
        ps.setInt(1,numeroCateg);
        rs = ps.executeQuery();
        while(rs.next()){
            Formation uneFormation = new Formation(rs.getString(1),rs.getInt(2), rs.getString(3));
            lesFormations.add(uneFormation);
        }
        return lesFormations;
    }

}
