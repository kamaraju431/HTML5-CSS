package stringsExample;

public class OverloadConstruct {
	OverloadConstruct(){
		System.out.println("this is default constructor kamu");
	}
	OverloadConstruct(int i,int j){
		System.out.println("this is parameterized constructor kamu1");
		i=i+1;
		j=i+j;
		System.out.println(i);
		System.out.println(j);
	}
	OverloadConstruct(float f1,float f2){
		System.out.println("this is parameterized constructor kamu2");
		float f3=f1+f2;
		System.out.println(f3);
	}

	public static void main(String[] args) {
		OverloadConstruct oc=new OverloadConstruct();
		OverloadConstruct oc1=new OverloadConstruct(10,20);
		OverloadConstruct oc2=new OverloadConstruct(5f,3f);

	}

}
