package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import bean.Commande;

public class CommandeDao {
	String path="C:\\Users\\59013-42-15\\eclipse-workspaceJEE\\ProjetJee\\commande";
	 
    public void saveCommande(Commande commande) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(commande);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Commande getCommande() {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Commande commande =(Commande)(ois.readObject());
            ois.close();
            return commande;
        } catch (Exception e) {
                e.printStackTrace();
        }
        return null;
    }

	

}
