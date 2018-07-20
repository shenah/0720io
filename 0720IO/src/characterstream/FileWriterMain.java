package characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("./data.txt", true);
			fw.write("방가방가 \n"); // 줄바꿈은 안됨
			fw.write("안녕하세요.");
			fw.flush();
		} catch (Exception e) {
			System.out.println("FileWriter기록예외:" + e.getMessage());
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
