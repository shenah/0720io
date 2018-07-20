package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamMain {

	public static void main(String[] args) {
		// try - catch - finally ���� ���� �ٸ� ��
		// �Բ� ����� ������ ���ۿ��� �����Ѵ�.
		FileOutputStream fos = null;
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� ����
			// ���� ������Ʈ ���丮�� ������ ����
			// .�� ���� ���丮 true���� ���ڸ� �߰�
			fos = new FileOutputStream("./0720byte.txt");

			// ���Ͽ� 1byte ���
			// fos.write(97);

			// ���Ͽ� ����Ʈ �迭�� ���
			// byte [] ar = {97,98,99,100};
			// fos.write(ar);

			// ���ڿ��� ����Ʈ �迭�� ��ȯ�ؼ� ���
			// getBytes �̿� - �߿�
			String str = "�ȳ��ϼ���.";
			fos.write(str.getBytes());

			// ������ ������ ����
			fos.flush();
		} catch (Exception e) {
			// ���ܰ� �߻����� �� ������ ����
			System.out.println("���� ���� ����:" + e.getMessage());
			//
			//
		} finally {
			// ���� �߻� ���ο� ������� ������ ����
			// (File�� ���õ� �� finally���� ���� �ƴϸ� ����)
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

			// 4 ����Ʈ �б�

			while (true) {
				byte[] b = new byte[100];
				int r = fis.read(b);
				
				System.out.println(new String(b));
				
				if (r <= 0) {
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("���� ����� ����:" + e.getMessage());
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
