package ch19_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("getByName �޼��� ȣ��");
		System.out.println("hostname:" + ip.getHostName());
		System.out.println("ip address:" + ip.getHostAddress());
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		System.out.println("getAllByName �޼��� ȣ��");
		for (InetAddress i : ips) {
			System.out.println("ip �ּ�:" + i);
		}
		// getAddress() : ip�ּҰ��� byte[]�迭�� ����
		byte[] ipAddr = ip.getAddress();
		// byte �ڷ����� ǥ�� ���� : -128 ~ 127
		// 127�̻��� ���� ������ ǥ����.
		for (byte b : ipAddr) {
			System.out.print(((b < 0) ? b + 256 : b) + ".");
		}
		System.out.println();
		System.out.println("getLocalHost �޼��� ȣ��");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("����ǻ��IP:" + local);
		System.out.println("getByAddress �޼��� ȣ��");
		InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
		System.out.println(ips[0].getHostAddress() + "�ּ� :" + ip2);
		int[] intaddr = { 52, 204, 129, 22 };
		byte[] byteaddr = new byte[4];
		for (int i = 0; i < intaddr.length; i++) {
			byteaddr[i] = (byte) ((intaddr[i] > 127) ? intaddr[i] - 256 : intaddr[i]);
		}
		InetAddress ip3 = InetAddress.getByAddress(byteaddr);
		System.out.println(ip3);
	}
}
