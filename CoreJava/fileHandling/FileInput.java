package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
public static void main(String[] args) {
		
		FileInputStream f1;
		try {
			f1 = new FileInputStream("anu.txt");
			int j=0;
			while((j=f1.read()) != -1)
			{
				System.out.print((char)j);
			}
		} 
		 catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
