package pack8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//List 인터페이스 : 중복가능 , 순서있다.

public class TestList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		list.clear(); // 비우기
		System.out.println(list.size());
		list.add("kim");
		list.add("lee");
		list.add("park");
		list.add("kim");
		list.add("choi");
		list.remove("lee"); // lee 삭제
		list.remove(0); //
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0)); // 순서가 있기때문에 get으로 몇번째인지 볼수있음
		System.out.println(list.contains("park")); // >park 이 있으면 true 없으면 false
		System.out.println("--------------");
		print(list);
		print2(list);

	}

	public static void print(List list) {
		Iterator iter = list.iterator(); // 나열형 인터페이스
		while (iter.hasNext()) {
			String ss = (String) iter.next();
			System.out.println(ss);

		}

	}

	public static void print2(List obj) { // 객체생성후 for문으로 반복

		System.out.println();
		for (Object aa : obj) {
			System.out.println(aa);
		}

	}

}
