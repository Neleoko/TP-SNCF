package Controlleurs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CtrlAgent {
    // Cet objet permet de récupérer les identifiants de connexion
    private Connection cnx;
    // Cet objet permet d'ecrire nos requetes sql
    private PreparedStatement ps;
    // Cet objet permet de récupérer le résultat de notre requête
    private ResultSet rs;
}
