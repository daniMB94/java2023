package ejemplo.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServidor {
	    private ServerSocket serverSocket;
	    private Socket clientSocket;
	    private PrintWriter out;
	    private BufferedReader in;

	    public void start(int port) throws IOException {
	    	System.out.println("Esperando saludo en puerto 6666 ...");
	        serverSocket = new ServerSocket(port);
	        
	        while (true) {
	        	//Cuando me llega algo al puerto 6666 abro una comunicación con ese equipo, mientras queda a la espera
		        clientSocket = serverSocket.accept();
		        //Lo que escriba el servidor va aquí
		        out = new PrintWriter(clientSocket.getOutputStream(), true);
		        //Lo que recibe el servidor va aquí
		        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		        String greeting = in.readLine();
		        
		        System.out.println("Recibido mensaje de cliente " + clientSocket.getInetAddress());
		        
	            if ("hola servidor".equals(greeting)) {
	                out.println("hola cliente");
	            }
	            else {
	                out.println("saludo no reconocido");
	            }
	        }
	    }

	    public void stop() throws IOException {
	        in.close();
	        out.close();
	        clientSocket.close();
	        serverSocket.close();
	    }
	    public static void main(String[] args) {
	        SocketServidor server=new SocketServidor();
	        try {
				server.start(6666);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	}