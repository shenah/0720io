package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-03\\Desktop\\java\\0702.txt"));
			StringBuilder sb = new StringBuilder();
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				sb.append(str);
			}
			String content = sb.toString();
			sb = null;
			System.out.println(content);
		} catch (Exception e) {
			System.out.println("¿¹¿Ü:" + e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
