package try_github;

public class Main {

	public static void main(String[] args) {
		final int a =10;
		final int b=5;

		Sub sub = new Sub();
		Add add =new Add();

		int addResult,subResult;

		addResult = Add.add(a,b);
		System.out.println(addResult);


		subResult = Sub.sub(a,b);

		System.out.println(subResult);

	}



}
