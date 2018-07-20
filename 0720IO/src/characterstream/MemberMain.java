package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		// 키보드로부터 줄 단위로 입력을 받을수 있는 클래스의 참조형 변수 선언
		// finally에 close를 할 수 있도록 try 밖에서 변수를 선언합니다.
		BufferedReader br = null;
		try {
			// 키보드로부터 입력받을 수 있는 인스턴스 생성
			br = new BufferedReader(new InputStreamReader(System.in));

			// 문자열 한 줄을 읽어오기
			System.out.println("이름:");
			String name = br.readLine();
			System.out.println("나이:");
			String age = br.readLine();
			System.out.println("키:");
			String height = br.readLine();

			Member member = new Member();
			member.setName(name);
			member.setAge(Integer.parseInt(age));
			member.setHeight(Double.parseDouble(height));

			// 맵을 이용해서 저장
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));

			// VO 클래스 와 Map 출력
			System.out.println(member);
			System.out.println(map);

			// 사용할 때는 다름 - 나이를 1씩 더하기
			int r = member.getAge() + 1;
			int m = (Integer) map.get("age");// object를 리턴하기 때문에 강제형변환을 해야한다
		} catch (Exception e) {
			System.out.println("BufferedReader입력예외처리:" + e.getMessage());
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
