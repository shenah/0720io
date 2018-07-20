package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamMain {

	public static void main(String[] args) {
		// try - catch - finally 블럭은 각각 다른 블럭
		// 함께 사용할 변수는 블럭밖에서 선언한다.
		FileOutputStream fos = null;
		try {
			// 예외가 발생할 가능성이 있는 구문
			// 현재 프로젝트 디렉토리에 파일을 생성
			// .은 현재 디렉토리 true쓰면 문자를 추가
			fos = new FileOutputStream("./0720byte.txt");

			// 파일에 1byte 기록
			// fos.write(97);

			// 파일에 바이트 배열을 기록
			// byte [] ar = {97,98,99,100};
			// fos.write(ar);

			// 문자열을 바이트 배열로 변환해서 기록
			// getBytes 이용 - 중요
			String str = "안녕하세요.";
			fos.write(str.getBytes());

			// 버퍼의 내용을 비우기
			fos.flush();
		} catch (Exception e) {
			// 예외가 발생했을 때 수행할 구문
			System.out.println("파일 쓰기 예외:" + e.getMessage());
			//
			//
		} finally {
			// 예외 발생 여부에 상관없이 수행할 구문
			// (File과 관련된 건 finally까지 쓰고 아니면 빼기)
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(".\\0720byte.txt");
			//int r = fis.read();
			//System.out.println(r);

			// 4 바이트 읽기

			while (true) {
				byte[] b = new byte[100];
				int r = fis.read(b);
				
				System.out.println(new String(b));
				
				if (r <= 0) {
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("파일 입출력 예외:" + e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
