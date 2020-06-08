package code;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import dtopractioce.StudDto;

public class DtoMain {

	ArrayList<Code> list = new ArrayList<Code>();
	int tot = 0;

	public DtoMain() {

	}

	public void inputData(int code, String product, int su) {

		Code dto = new Code();

		dto.setProduct(product);
		dto.setCode(code);
		dto.setSu(su);
		list.add(dto);
		if (dto.getProduct().equals("새우깡")) {
			tot = 450;

		} else if (dto.getProduct().equals("감자깡")) {
			tot = 300;

		}

	}

	private void showdata() {

		System.out.println("지역\t상품명\t수량\t단가\t금액");
		Code dto = new Code();
		for (int i = 0; i < list.size(); i++) {
			dto = list.get(i);
			if (dto.getCode() == 100) {
				System.out.print("강남");
			} else if (dto.getCode() == 200) {
				System.out.print("강북");

			} else if (dto.getCode() == 300) {
				System.out.print("강서");
			}

			System.out.println("\t" + dto.getProduct() + "\t" + dto.getSu() + "\t" + tot + "\t" + (tot * dto.getSu()));

		}

	}

	public static void main(String[] args) {

		DtoMain main = new DtoMain();
		Code dto;
		Scanner sc = new Scanner(System.in);
		int code, su;
		String product;
		while (true) {
			dto = new Code();
			System.out.println("값입력");
			dto.setMm((sc.next()));
			StringTokenizer token = new StringTokenizer(dto.getMm(), ",");

			code = Integer.parseInt(token.nextToken());
			product = token.nextToken();
			su = Integer.parseInt(token.nextToken());

			main.inputData(code, product, su);

			System.out.println("계속하시겠습니까? y/n");
			String b = sc.next();
			if (b.equals("y")) {
				continue;
			} else if (b.equals("n")) {
				break;

			}

		}

		main.showdata();

	}

}
