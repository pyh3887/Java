package pack9_200205_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class IoTest3 {

	
	// 1byte 단위로 입출력 : text,image,media file 등을 처리할수있다.

	public void write_file(File file, ArrayList<String> str_list) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8")); //>file을 buffer writer
			//BufferedWriter writer = new BufferedWriter(new FileReader(file));	>2byte 문자용						까지 차례로 전달	
			for (String str : str_list) {
				writer.write(str, 0, str.length()); // 0부터 크기만큼
				writer.newLine();	//다음라인으로 이동
			}
			writer.close();

		} catch (Exception e) {
			System.out.println("write_file err :" + e);
		}
		System.out.println("저장성공");
	}

	public void read_file(File file) {
		try {
			StringBuffer buffer = new StringBuffer();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8")); // 파일을넣어줌
			//BufferedReader reader = new BufferedReader(new FileReader(file));
			String oneLine;
			while ((oneLine = reader.readLine()) != null) {	// 한줄씩 입력된 readLine의 값이없울때까지 출력
				buffer.append(oneLine + "\n");

			}
			reader.close();
			System.out.println(buffer.toString());
		} catch (Exception e) {
			System.out.println("read_file err :" + e);
		}

	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("자바");
		list.add("파이썬");
		list.add("c-language");

		File fi = new File("c:/work/abc.txt"); // 경로만 지정
		IoTest3 test3 = new IoTest3();
		test3.write_file(fi, list);	// fi> 파일경로객체 list > Array list 를 이용한 컬렉션 
		test3.read_file(fi);

	}

}
