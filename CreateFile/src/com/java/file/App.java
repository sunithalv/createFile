package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		File directory = new File("dir\\test\\value");
		directory.mkdirs();
		System.out.println("Diretory created");
		File file = new File("dir\\test\\value\\testing.txt");
		//file.createNewFile();
		//System.out.println("File created");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			bw.write("Sunitha");
			bw.newLine();
			bw.write("Anwitha");
			bw.newLine();
			bw.write("Adidev");
			bw.newLine();
			bw.write("Krishnan");
			System.out.println("Wrting onto the file completed");
			bw.close();
		}catch(IOException e){
			System.out.println("Error occured while wrting onto the file ");
		}
		/*
		 * try { BufferedReader br = new BufferedReader(new
		 * FileReader("dir\\\\test\\\\value\\\\testing.txt")); String line;
		 * while((line=br.readLine()) !=null) { System.out.println(line); } 
		 * }catch (FileNotFoundException e) { // TODO: handle exception }
		 */
		
		try {
			Scanner sc = new Scanner(new File("dir\\test\\value\\testing.txt"));
			String line;
			while(sc.hasNext()) {
			line = sc.next();
			System.out.println(line);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while reading file");
		}
		
		if(file.delete()) {
			System.out.println("File deletion successful");
		}else {
			System.out.println("Error doing file deletion");
		}
		
		
	}

}
