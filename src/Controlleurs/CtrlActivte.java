package Controlleurs;

import Entities.Activite;
import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlActivte {
    // Cet objet permet de récupérer les identifiants de connexion
    private Connection cnx;
    // Cet objet permet d'ecrire nos requetes sql
    private PreparedStatement ps;
    // Cet objet permet de récupérer le résultat de notre requête
    private ResultSet rs;

    public CtrlActivte() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Activite> getAllActivite() throws SQLException {
        ArrayList<Activite> LesActivites = new ArrayList<>();

        //1) Ecrire la requete
        ps = cnx.prepareStatement("SELECT numero , libelle FROM activite");
        //2) L'executer
        rs = ps.executeQuery();
        //3) Parcourir le jeu d'enregistrements
        while(rs.next()){
            Activite uneActivite = new Activite(rs.getInt(1) , rs.getString(2));
            LesActivites.add(uneActivite);
        }
        return LesActivites;
    }

}
