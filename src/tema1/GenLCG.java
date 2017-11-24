package tema1;

public class GenLCG implements IGenerator{

	private int seed;	
	private int a;	
	private int m;	
	private int c;	
	private int n;	
	
	public GenLCG(int seed, int a, int m, int c) {
		this.seed = seed;
		this.a = a;
		this.m = m;
		this.c = c;
		n = 0;
	}

	@Override
	public float next() {
		int seed2 = (a * seed + c) % m;
		seed = seed2;
		return seed;
	}

}
