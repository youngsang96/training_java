package ch19_network;
import java.io.*;
import java.net.*;

public class EchoServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 5000; Socket socket = null;
		ServerSocket server = null;
		try {
		server = new ServerSocket(port);
		System.out.println("서버 준비됨");
		socket = server.accept();
		System.out.println("server: "+ server);
		System.out.println("localport: "+ server.getLocalPort());
		System.out.println("connected ip: "+ socket.getInetAddress());
		System.out.println("connected port: "+ socket.getPort());
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		String input = "";
		
		while ((input = in.readLine()) != null) {
			out.println(input+" data 받았습니다.");
			out.flush();
			System.out.println(input);
			if(input.equals("bye")) break;
		}
		
		in.close();
		socket.close(); 
		server.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
