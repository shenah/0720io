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
			//배열을 반복문 밖에서 만들때에는 
			/*char [] b = new char[15];
			while(true) {
				int r = fr.read(b);
				System.out.println(new String(b, 0, r));
				if(r<=0) {
					break;
				}*/
			}
		}catch(Exception e) {
			System.out.println("FileReader입력예외발생:" + e.getMessage());
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
		

}
