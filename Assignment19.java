package Assignment19;

public class Assignment19 {
	public static void main(String[] args) {
		int a=33;
		int b=26;
		int f=a-b;
		
		System.out.println("addition   "+ (a+b));
		System.out.println("sub   "+f);
		System.out.println("mul  "+a*b);
		System.out.print("division  "+a/b);
		relation(4,6);
		
	}
	
	public static void relation(int g,int h) {
		if(g==h) {
			System.out.print("same number");
		}else {
			System.out.print("diffrent number");
		}
	}

}


