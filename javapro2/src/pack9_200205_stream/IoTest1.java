package pack9_200205_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class IoTest1 {

	public static void main(String[] args) throws Exception {
		// 1byte 단위의 입출력
//		System.out.print("1byte 입력 : ");
//		int a = System.in.read(); // 'a' >1 byte "a" > 2byte String으로 받을수 없음
//		System.out.println("a :" + a + " " + (char)a);

		OutputStreamWriter os = new OutputStreamWriter(System.out);
//		byte imsi = 65;
//		os.write(imsi);
//		os.flush();	//버퍼를 깨끗이 비우는것
//		os.close();	//

		BufferedWriter bw = new BufferedWriter(os, 1024);
		PrintWriter out = new PrintWriter(bw);
		out.println(123);
		out.println("문자열 출력");
		out.close(); // 메모리해제
		bw.close();
		os.close();
		System.out.println("문자열 출력");

		System.out.println();
		File f = new File("c:/work/iotest.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw2 = new BufferedWriter(fw, 1024); // 1024 생략가능 기본값
		PrintWriter out2 = new PrintWriter(bw2);
		out2.println("날씨가 춥네");
		out2.println("내일까지");
		out2.close();
		bw2.close();
		fw.close();

	}

}
