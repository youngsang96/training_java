package ch19_network;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 5000;
		String ip = "192.168.137.1";
		Socket socket = null;
		try {
			String input="";
			Scanner sc = new Scanner(System.in);
			socket = new Socket(ip, port);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println("local port: "+socket.getLocalPort() );
			System.out.println("local ip: "+socket.getLocalAddress());
			System.out.println("server port: " + socket.getPort());
			System.out.println("server ip: "+socket.getInetAddress());
			System.out.println("메세지 입력: ");
			while((input = sc.next())!=null) {
				if(input.equals("bye")) break;
				out.println(input);
				out.flush();
				System.out.println("server msg: " + in.readLine());
				System.out.println("다음 메세지를 입력하세요:");
			}
			socket.close();
		}catch(IOException e) {
			
		}
	}

}
