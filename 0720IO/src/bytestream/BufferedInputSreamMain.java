package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputSreamMain {

	public static void main(String[] args) {

		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\Users\\503-03\\Desktop\\java\\0702.txt"));
			while(true) {
				byte [] b = new byte[1024];
				int r = bis.read(b);
				System.out.println(new String(b));
				if(r<=0) {
					break;
				}
			}
		}catch(Exception e) {
			System.out.println("입력예외발생:" + e.getMessage());
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
