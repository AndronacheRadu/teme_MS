package tema1;

public class Main {
	public static void main(String[] args) {
		GenMiddleSquare gen = new GenMiddleSquare(125); // call function // change for LCG with param
		for(int i = 0; i < 10; i++)
		System.out.println(gen.next());
		
		Evaluator e = new Evaluator(gen, 10); // call function
		
		System.out.println(e.eval());
	}
}
