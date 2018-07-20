package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-03\\Desktop\\java\\access_log.txt"));
			//������ �����Ǹ� �ߺ� ������� �����ϱ� ���� �ڷᱸ�� - List
			ArrayList<String> iplist = new ArrayList<>();
			//�ߺ����� ������ ���� - Set
			Set<String> ipset = new HashSet<>();
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				//�������� ����
				String [] ar = str.split(" ");
				iplist.add(ar[0]);
				ipset.add(ar[0]);
			}
			for(String temp : ipset) {
				System.out.println(temp);
			}
		} catch (Exception e) {
			System.out.println("����:" + e.getMessage());
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
