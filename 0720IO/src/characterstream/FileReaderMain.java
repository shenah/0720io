package characterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("./data.txt");
			while(true) {
				char [] b = new char[8];
				int r = fr.read(b);
				System.out.println(new String(b));
				if(r<=0) {
					break;
				}
			//�迭�� �ݺ��� �ۿ��� ���鶧���� 
			/*char [] b = new char[15];
			while(true) {
				int r = fr.read(b);
				System.out.println(new String(b, 0, r));
				if(r<=0) {
					break;
				}*/
			}
		}catch(Exception e) {
			System.out.println("FileReader�Է¿��ܹ߻�:" + e.getMessage());
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
		

}
