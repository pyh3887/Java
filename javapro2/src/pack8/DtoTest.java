package pack8;

import java.util.ArrayList;

public class DtoTest {

	ArrayList<StudentDto> list = new ArrayList<StudentDto>();

	public void aa() {
		String[] persons = new String[3];
		persons[0] = "홍길동";
		persons[1] = "고길동";
		persons[2] = "나길동";

		for (String s : persons) {

			System.out.println(s);
		}

	}

	public void insertData() {
		// 학번,이름,점수 를 레코드 단위로 입력 후 기억
		StudentDto dto = null;

		dto = new StudentDto();
		dto.setHakbun("ks1");
		dto.setIrum("홍길동");
		dto.setJumsu(90);
		list.add(dto); // 첫번째 학생 자료 기억 //student dto 로 묶여서 컬렉션에 저장

		dto = new StudentDto();
		dto.setHakbun("ks2");
		dto.setIrum("고길동");
		dto.setJumsu(80);
		list.add(dto); // 두번째 학생 자료 기억

		dto = new StudentDto();
		dto.setHakbun("ks3");
		dto.setIrum("신길동");
		dto.setJumsu(70);
		list.add(dto); // 세번째 학생 자료 기억		dto 0 , 1 , 2  컬렉션에 저장

	}

	public void showData() {
		System.out.println("학생수는 " + list.size() + "명");		
		for (int i = 0; i < list.size(); i++) {
			StudentDto dto = new StudentDto(); //
			dto = list.get(i);
			System.out.println(dto.getHakbun() + " " + dto.getIrum() + " " + dto.getJumsu());
		}
	}

	public static void main(String[] args) {
		// DTO 연습 : 레코드형 기억장소

		DtoTest test = new DtoTest();
		test.aa();
		test.insertData();
//		System.out.println(test.list.size());  3
		test.showData();
	}
}
