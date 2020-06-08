package pack8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 	Map 인터페이스 : 자료를 key, value 형태로 저장. 많은 양의 데이터인 경우 검색이 편리

public class TestMap {

	public static void main(String[] args) {

		HashMap<String, String> list = new HashMap<String, String>(); // 키, 값 제네릭의 역할 : 타입값을 조정할수 있따.
		list.put("0", "lee");
		list.clear(); // 비우기
		list.put("1", "lee");
		list.put("2", "kim");
		list.put("3", "lee");
		list.put("4", "park");
		list.put("5", "choi");
		list.remove(3); // 3번째 키 삭제

		System.out.println(list.size());
		System.out.println(list.containsKey("0")); // 키 0 이있는가?
		System.out.println(list.containsValue("lee")); // value값에 lee 가있는가?
		
		System.out.println();
		print(list);
	}

	public static void print(Map map) {
		Set set = map.keySet(); // 나열형 인터페이스
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			System.out.println("key : " + key);
			System.out.println("key : " + map.get(key));

		}

	}

}
