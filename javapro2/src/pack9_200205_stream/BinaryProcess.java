package pack9_200205_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryProcess {

	public static void main(String[] args) throws Exception {
		BinaryData data = new BinaryData();

		// 이진 자료 파일로 저장

		File dir = new File("c:/work/"); // 경로명과 파일명을 따로 입력도 가능
		File file = new File(dir, "abcbi.data");
		FileOutputStream f = new FileOutputStream(file);
		BufferedOutputStream bo = new BufferedOutputStream(f, 1024);
		ObjectOutputStream oo = new ObjectOutputStream(bo);	//데이터를 직렬로 쭉 늘어놓음
		oo.writeObject(data);
		oo.close();
		bo.close();
		f.close();
		System.out.println("저장 성공");

		// 이진자료 파일읽기

		System.out.println();

		File file2 = new File("c:/work/abcbi.data");
		FileInputStream fis = new FileInputStream(file2);
		BufferedInputStream bi = new BufferedInputStream(fis, 1024);
		ObjectInputStream oi = new ObjectInputStream(bi);
		Object obj = oi.readObject();

		BinaryData data2 = (BinaryData) obj;
		System.out.println(data2.i);
		System.out.println(data2.d);
		System.out.println(data.s1);
		System.out.println(data.s2);
		oi.close();
		bi.close();
		fis.close();

	}

}
