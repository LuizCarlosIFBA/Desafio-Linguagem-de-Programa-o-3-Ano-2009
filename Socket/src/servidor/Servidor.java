package servidor;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class Servidor {
	 public static void main(String[] args) {
		    try {

		      ServerSocket server = new ServerSocket(12345);
		      System.out.println("Servidor conseguiu escutar a porta");
		      while(true) {
		       
		        Socket cli = Servidor.accept();
		        System.out.println("Cliente conectado: " + cli.getInetAddress().getHostAddress());
		        ObjectOutputStream saida = new ObjectOutputStream(cli.getOutputStream());
		        saida.flush();
		        saida.writeObject(new Date(0));
		        saida.close();
		        cli.close();
		      }  
		    }   
		    catch(Exception e) {
		       System.out.println("Erro: " + e.getMessage());
		    }  
		  }     
}
