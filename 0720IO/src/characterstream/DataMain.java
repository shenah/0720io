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
			//접속한 아이피를 중복 상관없이 저장하기 위한 자료구조 - List
			ArrayList<String> iplist = new ArrayList<>();
			//중복없이 데이터 저장 - Set
			Set<String> ipset = new HashSet<>();
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				//공백으로 분할
				String [] ar = str.split(" ");
				iplist.add(ar[0]);
				ipset.add(ar[0]);
			}
			for(String temp : ipset) {
				System.out.println(temp);
			}
		} catch (Exception e) {
			System.out.println("예외:" + e.getMessage());
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
