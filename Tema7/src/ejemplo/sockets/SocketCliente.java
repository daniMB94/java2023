package ejemplo.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketCliente {
	private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws UnknownHostException, IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) {
        out.println(msg);
        String resp="";
		try {
			resp = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return resp;
    }

    public void stopConnection() {
        try {
			in.close();
	        out.close();
	        clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
    
    public static void main(String[] args) {
    	System.out.println("Soy el cliente y le voy a mandar un mensaje al servidor");
    	SocketCliente client = new SocketCliente();
    	try {
			client.startConnection("192.168.100.56", 6666);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	String response = client.sendMessage("hola servidor");
    	System.out.println("Servidor: " + response);

	}
}