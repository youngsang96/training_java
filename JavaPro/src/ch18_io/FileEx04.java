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
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		System.out.println();
		printFileList(dir);
		System.out.println("총 "+totalFiles+"개의 파일");
		System.out.println("총 "+totalDirs+"개의 디렉토리");
	}
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath()+"   디렉토리");
		
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
		System.out.println((files.length - subDir.size()) + "개의 파일, " + subDir.size()+"개의 디렉토리");
		for(int i=0; i<subDir.size(); i++) {
			printFileList(files[(int) subDir.get(i)]);
		}
	}
}
