package code;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;

public class CompanyDto {

	ArrayList<DtoClass> list = new ArrayList<DtoClass>();
	Calendar calendar = Calendar.getInstance();
	private void input(int number, String name, int pay, int day) {
		DtoClass dto = null;
		int year = calendar.get(Calendar.YEAR);
		
		
		dto = new DtoClass();
		dto.setNumber(number);
		dto.setName(name);
		dto.setPay(pay);
		dto.setDay(day);
		list.add(dto);

		dto.setLongday(year - day);

		if (dto.getLongday() <= 3) {
			dto.setSudang(150000);
		} else if (3 < dto.getLongday() && dto.getLongday() <= 8) {
			dto.setSudang(450000);
		} else if (dto.getLongday() >= 9) {
			dto.setSudang(1000000);
		}

		if (dto.getSudang() + dto.getPay() >= 3000000) {
			dto.setSe(0.5);
		} else if (dto.getSudang() + dto.getPay() >= 2000000) {
			dto.setSe(0.3);
		} else if (dto.getSudang() + dto.getPay() < 2000000) {
			dto.setSe(0.15);
		}

	}

	private void display() {
		System.out.println("사번\t이름\t기본급\t근무년수\t근무수당\t공제액");
		DtoClass dto = new DtoClass();
		dto = list.get(0);
		System.out.println(dto.getNumber() + "\t" + dto.getName() + "\t" + dto.getPay() + "\t" + dto.getLongday() + "\t"
				+ dto.getSudang());

	}

	public static void main(String[] args) {
		CompanyDto companydto = new CompanyDto();
		DtoClass dto;
		int number, pay, day;
		String name;

		StringTokenizer token = new StringTokenizer(args[0], ",");
		number = Integer.parseInt(token.nextToken());
		name = token.nextToken();
		pay = Integer.parseInt(token.nextToken());
		day = Integer.parseInt(token.nextToken());

		companydto.input(number, name, pay, day);
		companydto.display();

	}
}
