package dtopractioce;

import java.util.ArrayList;
import java.util.Scanner;

import pack8.StudentDto;

public class DtoTest {

	ArrayList<StudDto> list = new ArrayList<StudDto>();

	public void insertData() {
		StudDto dto = null;

		boolean a = true;

		Scanner sc = new Scanner(System.in);
		while (a) {
			dto = new StudDto();

			System.out.print("이름을 입력하세요 : ");
			dto.setIrum(sc.next());
			System.out.print("국어점수 : ");
			dto.setKor(sc.nextInt());
			System.out.print("영어점수 : ");
			dto.setEng(sc.nextInt());

			list.add(dto);

			while (true) {
				System.out.println("계속할까요? y/n");
				String b = sc.next();
				if (b.equals("y")) {
					break;
				} else if (b.equals("n")) {
					a = false;
					break;
				} else
					continue;
			}
		}

	}

	public void showData() {
		System.out.println("이름	국어	영어	총점");

		for (int i = 0; i < list.size(); i++) {
			StudDto dto = new StudDto(); //
			dto = list.get(i);
			System.out.println(
					dto.getIrum() + "\t" + dto.getKor() + "\t" + dto.getEng() + "\t" + (dto.getKor() + dto.getEng()));
		}

		System.out.println("응시인원 " + list.size() + "명");
	}

	public static void main(String[] args) {
		DtoTest test = new DtoTest();
		test.insertData();
		test.showData();
	}
}
