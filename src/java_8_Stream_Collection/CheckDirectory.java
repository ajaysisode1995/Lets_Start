package java_8_Stream_Collection;

import java.io.File;

public class CheckDirectory {
	public static void main(String[] args) {
			File directory=new File("C:\\Users\\Mobile Programming.DESKTOP-5VPG6JO\\Desktop\\MyDoc");
			
			if (directory.isDirectory()) {
				
				
				String[] list = directory.list();
				
				if (list.length>0) {
					System.out.println("The directory::"+directory.getPath()+"is not empty");
				}
				else {
					System.out.println("The directory::"+directory.getPath()+"is empty");
				}
			}
	}
}
