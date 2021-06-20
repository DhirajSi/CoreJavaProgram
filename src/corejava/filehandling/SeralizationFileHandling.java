package corejava.filehandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SeralizationFileHandling {

	public static void main(String[] args) {
		FileOutputStream fos;
		try {

			fos = new FileOutputStream("Notes");
			DataOutputStream dos = new DataOutputStream(fos);

			try {
				dos.writeUTF("Maldivies i ball testing");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
