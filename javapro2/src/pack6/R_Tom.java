package pack6;

public class R_Tom implements Resume {

	private String irum, phone, juso;

	@Override
	public void setIrum(String irum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub

	}

	public void setJuso(String juso) {
		this.juso = juso;
	}

	@Override
	public void print() {
//		Resume.SIZE = "b5";  final
		System.out.println("이력서 용지 규격은" + Resume.SIZE);
		System.out.println("이름 :" + irum + ", 전화:" + phone + ", 주소:" + juso);
		playJav(true);
		Resume.changeData();
	}

	void abc() {
		System.out.println("톰의 고유 메소드");

	}

}
