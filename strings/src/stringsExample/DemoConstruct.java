package stringsExample;

public class DemoConstruct {
	DemoConstruct() {
		System.out.println("this is default constructor");
	}

	DemoConstruct(int i, int j) {
		this();
		System.out.println("this is parameterized constructor");
		i = i + 1;
		j = i + j;
		System.out.println(i);
		System.out.println(j);
	}

	DemoConstruct(float f1, float f2) {
		this(10,20);
		System.out.println("this is parameterized constructor");
		float f3=f1+f2;
		System.out.println(f3);
	}

	public static void main(String[] args) {
		DemoConstruct d1=new DemoConstruct(3f,5f);
	}

}
