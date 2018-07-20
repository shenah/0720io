package characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("./data.txt", true);
			fw.write("�氡�氡 \n"); // �ٹٲ��� �ȵ�
			fw.write("�ȳ��ϼ���.");
			fw.flush();
		} catch (Exception e) {
			System.out.println("FileWriter��Ͽ���:" + e.getMessage());
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
