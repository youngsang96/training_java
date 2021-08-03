package ch19_network;

import java.io.*;
import java.net.*;

public class SimpleWebServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(50962);
			Socket socket= null;
			while(true) {
				System.out.println("클라이언트 접속 대기");
				socket = server.accept();
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(socket);
				ht.start();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
		static class HttpThread extends Thread{
			private Socket server; BufferedReader br; PrintWriter pw;
			HttpThread(Socket server){
				this.server=server;
				try {
					br = new BufferedReader(new InputStreamReader(server.getInputStream()));
					pw = new PrintWriter(server.getOutputStream());
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			public void run() {
				BufferedReader sfile = null;
				try {
					String line = br.readLine();
					System.out.println(line);
					String pathname = "index.html";
					System.out.println("["+line+"]");
					if(!line.startsWith("GET /favicon.ico")) {
						
						line = line.substring(line.indexOf("/")+1);
						line = line.substring(0,line.indexOf(" "));
						
						pathname = line;
						
						System.out.println("파일이름: "+ pathname);
						sfile = new BufferedReader(new FileReader(pathname));
						pw.println("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n");
						String fileLine ="";
						while((fileLine = sfile.readLine()) != null ) {
							pw.println(fileLine);
							pw.flush();
							}
					}
				}catch(Exception e) {
				}finally {
					try{
						sfile.close();
						br.close();
						pw.close();
						server.close();
					}catch (IOException e) {
						e.printStackTrace();}
				}
			}
		}
	}
		
