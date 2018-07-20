package bytestream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream("./data.dat"));
			ps.println("¾È³ç¾È³ç");
			ps.println("HelloHello");
			ps.append('a');
			ps.flush();
		}catch(Exception e) {
			System.out.println("Ãâ·Â¿¹¿Ü¹ß»ý:" + e.getMessage());
		}finally {
			if(ps != null) {
				ps.close();
			}	
		}

	}

}
