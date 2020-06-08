package pack6;

public class ResumeMain {

	public static void main(String[] args) {

		System.out.println("톰의 이력서");
		R_Tom r_tom = new R_Tom();
		r_tom.setIrum("김톰");
		r_tom.setPhone("111-1111");
		r_tom.setJuso("역삼동 123");
		r_tom.playJav(false);
		r_tom.print();
		System.out.println();
		Resume.changeData();
		r_tom.abc();

		System.out.println();
		System.out.println("제임스의 이력서");
		R_James r_james = new R_James();
		r_james.setIrum("이제임스");
		r_james.setPhone("111-2222");
		r_james.setskill("스프링 전문가");
		System.out.println("인사담당자가 이력서 취합 후 확인----------");
		Resume[] resBox = new Resume[2];
		resBox[0] = r_tom;
		resBox[1] = r_james;

		for (Resume box : resBox) {
			box.print();
			System.out.println("----------");
		}

	}

}
