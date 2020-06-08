package pack8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 인터페이스 : 중복 불가, 순서 없다.
public class TestSet {

	public static void main(String[] args) {
//		HashSet<Object> list = new HashSet<Object>();
		HashSet<String> list = new HashSet<String>(); // 객체의 타입을 정할수있다.

		list.add("lee"); // Boxing/UnBoxing
//		list.add(1);	//기본형은 원래 컬렉션에 담을수없다. 버젼업되면서 기본형이 박싱되어 참조형으로들어감.
//		TestSet ts = new TestSet();
//		list.add(ts);
		list.add("kim");
		list.add("park");
		list.add("choi");
		list.add("oh");
		System.out.println(list.size()); // list의 크기
		list.remove("kim"); // kim 제거
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.toString());

		print(list);
		System.out.println();
		print2(list.toArray());

	}

	public static void print(Set set) {
		Iterator iter = set.iterator(); // 나열형 인터페이스
		while (iter.hasNext()) {
			String ss = (String) iter.next();
			System.out.println(ss);

		}

	}

	public static void print2(Object[] obj) { // 객체생성후 for문으로 반복
		int count = obj.length;
		for (int i = 0; i < count; i++) {

			System.out.println(obj[i]);
		}
		System.out.println();
		for (Object aa : obj) {
			System.out.println(aa);
		}

	}
}
