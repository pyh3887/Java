package pack8;

import java.io.FileReader;

//예외처리 : 외부장치(키보드, 파일 ,DB , 네트워크 등) 와 연결해 작업 시 반드시 기술. 그외는 선택적기술
public class TryTest {

	public void test() {
		try {

		} catch (Exception e) {
			System.out.println("허걱 에러 : " + e); // 지역을 먼저 만남
		}
		int a[] = { 1, 2, 3 };
//		System.out.println("배열 요소값 : " + a[0]);	//문제없음
		System.out.println("배열 요소값 : " + a[5]); // 배열값이 3 인데 5 선언 에러예정.

	}

//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
//		FileReader fr = new FileReader("c:\\work\\aa.txt"); 	리눅스 유닉스방식
		try { // 외부장치 연결시에는 줄것
			FileReader FileReader = new FileReader("c:\\work\\aa.txt"); // 윈도우 방식

			int re = 10 / 2;
			System.out.println("re :" + re);
			TryTest tt = new TryTest();// 객체 생성했기 때문에 문제없음
			// TryTest tt = null;
			tt.test();
			/*
			 * } catch (FileNotFoundException e) {
			 * 
			 * System.out.println("파일 오류");
			 * 
			 * } catch (ArithmeticException e) {
			 * 
			 * System.out.println("나누기 에러 :" + e.getMessage()); // 에러메세지
			 * e.printStackTrace(); // 에러 메세지
			 * 
			 * } catch (NullPointerException e) {
			 * 
			 * System.out.println("객체 오류: " + e);
			 * 
			 * } catch (ArrayIndexOutOfBoundsException e) {
			 * 
			 * System.out.println("배열 참조 오류 " + e); }
			 */

		} catch (Exception e) {
			System.out.println("오류 : " + e); // 모든 에러메세지를 다받음
		}
		System.out.println("종료");
	}
}
