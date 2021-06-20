package corejava.filehandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeseralizationFileHandling {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("Notes");

			DataInputStream dos = new DataInputStream(fis);
			String result = "";

			try {
				result = dos.readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(result);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

			e.printStackTrace();
		}

		System.out.println("wdjsgjh");

	}
}
