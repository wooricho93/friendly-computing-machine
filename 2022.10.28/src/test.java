// 다음 클래스 정의에서 PersonalInfo의 clone() 메서드를 호출 시 깊은 복사가 이뤄지도록 clone 메서드를 오버라이딩하시오.

class Business implements Cloneable {
	String company;
	String work;
	
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	
	public void showBusinessInfo() {
		System.out.println("회사: " + company);
		System.out.println("업무: " + work);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class PersonalInfo implements Cloneable {
	String name;
	int age;
	Business bz;
	
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	
	public void showPersonalInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		bz.showBusinessInfo();
		System.out.println();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)super.clone();
		copy.bz = (Business)bz.clone();
		
		return copy;
	}
}

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		PersonalInfo original = new PersonalInfo("가나다", 26, "한글", "사무직");
		PersonalInfo copy;
		
		copy = (PersonalInfo)original.clone();
		original.showPersonalInfo();
		copy.showPersonalInfo();
		
		original.name = "Tom";
		original.age = 30;
		original.bz.company = "Microsoft";
		original.bz.work = "develop";
		original.showPersonalInfo();
		copy.showPersonalInfo();
	}

}
