package io;

import java.io.File;

public class FileTest3 {
	public static void main(String[] args) {
		File file=new File("F:\\AJava下载");
//		String[] fileNames=file.list();
//		for(String s:fileNames){
//			System.out.println(s);
//		}
		
//		File[] files=file.listFiles();
//		for(File f:files){
//			System.out.println(f.getName());
//		}
		
		System.out.println(file.getParent());
		
		
		String[] fileNames=file.list();
		for(String s:fileNames){
			if(s.endsWith(".pdf")){
				System.out.println(s);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
