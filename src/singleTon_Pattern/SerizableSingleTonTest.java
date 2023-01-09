package singleTon_Pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerizableSingleTonTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//seriasable 
		SerizableSingleton s1 = SerizableSingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
		
		oos.writeObject(s1);
		oos.close();
		
		//deserizable 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.ser"));
		SerizableSingleton s2=(SerizableSingleton) ois.readObject();
		ois.close();
		System.out.println(s1.getInstance().hashCode());
		System.out.println(s2.getInstance().hashCode());
		
	}
}
