package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bean.Client;

public class ClientDao {
	
	String path="C:\\Users\\59013-42-15\\eclipse-workspaceJEE\\ProjetJee\\client";
	 
    public void saveClient(Client client) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(client);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Client getClient() {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Client client =(Client)(ois.readObject());
            ois.close();
            return client;
        } catch (Exception e) {
                e.printStackTrace();
        }
        return null;
    }


}
