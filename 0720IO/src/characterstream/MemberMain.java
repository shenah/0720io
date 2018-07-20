package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		// Ű����κ��� �� ������ �Է��� ������ �ִ� Ŭ������ ������ ���� ����
		// finally�� close�� �� �� �ֵ��� try �ۿ��� ������ �����մϴ�.
		BufferedReader br = null;
		try {
			// Ű����κ��� �Է¹��� �� �ִ� �ν��Ͻ� ����
			br = new BufferedReader(new InputStreamReader(System.in));

			// ���ڿ� �� ���� �о����
			System.out.println("�̸�:");
			String name = br.readLine();
			System.out.println("����:");
			String age = br.readLine();
			System.out.println("Ű:");
			String height = br.readLine();

			Member member = new Member();
			member.setName(name);
			member.setAge(Integer.parseInt(age));
			member.setHeight(Double.parseDouble(height));

			// ���� �̿��ؼ� ����
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));

			// VO Ŭ���� �� Map ���
			System.out.println(member);
			System.out.println(map);

			// ����� ���� �ٸ� - ���̸� 1�� ���ϱ�
			int r = member.getAge() + 1;
			int m = (Integer) map.get("age");// object�� �����ϱ� ������ ��������ȯ�� �ؾ��Ѵ�
		} catch (Exception e) {
			System.out.println("BufferedReader�Է¿���ó��:" + e.getMessage());
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
