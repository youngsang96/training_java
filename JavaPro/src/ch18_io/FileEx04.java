package ch18_io;
import java.io.*;
import java.util.*;

public class FileEx04 {
	static int totalFiles = 0;
	static int totalDirs = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
			System.exit(0);
		}
		System.out.println();
		printFileList(dir);
		System.out.println("�� "+totalFiles+"���� ����");
		System.out.println("�� "+totalDirs+"���� ���丮");
	}
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath()+"   ���丮");
		
		File[] files = dir.listFiles();
		ArrayList subDir = new ArrayList();
		
		for(int i = 0; i < files.length; i++) {
			String filename = files[i].getName();
			
			if(files[i].isDirectory()) {
				filename = "[" + filename + "]";
				subDir.add(i);
			}
			System.out.println(filename);
		}
		totalDirs += subDir.size();
		totalFiles += (files.length - subDir.size());
		System.out.println((files.length - subDir.size()) + "���� ����, " + subDir.size()+"���� ���丮");
		for(int i=0; i<subDir.size(); i++) {
			printFileList(files[(int) subDir.get(i)]);
		}
	}
}
