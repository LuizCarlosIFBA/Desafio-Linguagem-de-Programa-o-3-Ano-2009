package cliente;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

public class Cliente {
	 public static void main(String[] args) {
		    try {
		      Socket cli = new Socket("paulo",12345);
		      ObjectInputStream in = new ObjectInputStream(cli.getInputStream());
		      Date data = (Date)in.readObject();
		      JOptionPane.showMessageDialog(null,"Data:" + data.toString());
		      in.close();
		      System.out.println("FIM");
		    }
		    catch(Exception e) {
		      System.out.println("Error: " + e.getMessage());
		    }
	 }    
}
