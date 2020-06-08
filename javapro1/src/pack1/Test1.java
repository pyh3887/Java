package pack1;


public class Test1 {
	public static void main(String[] args) {
		System.out.println("성공");
		System.out.println(10 + 20); // 한 줄 주석

		System.out.println("a");
		System.out.print("b");
		System.out.println("c");
		// 변수 : 기억장소의 이름 - 기본형
//		byte var1;
//		var1 = 10;
		byte var1 = 10; // 1byte 정수 기억 -128 ~ 127
		var1 = 127;
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		short var2;
		var2 = 20; // 2byte 정수 기억장소 ~-32768 ~ 32767

		System.out.println("var=" + var2);

		int var3 = 2147483647; // 4byte 정수 기억 -2147483648 ~ 2147483647
		System.out.println("var=  " + var3);

		long var4 = 3347483647L; // 8byte 정수 기억
		System.out.println("var=" + var4);
		System.out.println(Long.MAX_VALUE);
		
		//promotion : 자동 형변환 , cast : 강제 형변환
		byte b1 = (byte)127;
		System.out.println("b1 : " + b1);
		int b2 = 10;
		byte b3 = (byte)b2; // b2; x 컴파일러는 타입만봄 캐스팅
		System.out.println("b3 : " + b3);
		
		short s1 = 10;
		int i1 = s1;
		System.out.println("i1 : "  + i1);
		
		
		System.out.println("실수처리-------");
		double d1 = 10.5;  // 실수형은 double이 기본값
		d1 = 5;
		System.out.println("d1 : " + d1 );
		
		float f1 = (float)4.5;// 때문에 캐스팅해줘야됌
		f1 = 5.1F;
		System.out.println("f1 : " + f1 );
		
		int i2 = (int)3.5; // double 값을 강제형변환 버림
		System.out.println("i2 : " + i2);
		
		double d2 = 4.5 + 10; // 연산 시 큰 타입으로 자동 형변환
		System.out.println("d2 : " + d2);
		
		int i3 = (int)4.5 + 10; 
		System.out.println("i3 : " + i3);
		
		boolean bu = true;
		bu = false;
		System.out.println("bu : " +bu );
		
		char c1 = 'a';  
		c1 = 'A';
		//c1 = 'ab'; char 는 한문자만
		System.out.println("\nc1 : " + c1 + " " + (int)c1 + " " + (char)97);
		System.out.println("안녕" + "\n" + "반가워");
		System.out.println("안녕" + (char)10 + "반가워");
		System.out.println(0xa); //hex 16진수
		System.out.println(0xf);
		System.out.println(05); ///octal 8진수
		System.out.println(052);
		
		//참조형
		String irum = "홍길동"; // 저장공간에 주소를 기억
		System.out.println(irum);
		
		
	}

}
