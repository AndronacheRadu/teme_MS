package tema1;

public class GenMiddleSquare implements IGenerator{

	private Integer seed; 
	
	private int lenghtOfSeed;	

	public GenMiddleSquare(Integer seed) {
		this.seed = seed; // atrib value
		lenghtOfSeed = numberLenght(seed); // call function
	}

	@Override
	public float next() {
		return (float) (extractMidNumber()/Math.pow(10, numberLenght(seed))); // seed dimension/10 power lenght of seed (123->0.123)
	}
	
	private int numberLenght(int n) {
		return new Integer(n).toString().length(); // calculate seed lenght
	}
	
	private int extractMidNumber() {
		int numberAux = seed * seed;
		int lenghtNumberAux = numberLenght(numberAux);
		numberAux = (int) (numberAux / Math.pow((double)10, (double)(lenghtNumberAux/(lenghtNumberAux / 2)))); // first 2 cif
		int number2 = (int) (numberAux % Math.pow((double)10, (double)lenghtNumberAux/2)); // last 2 cif
		seed = number2;
		return number2;
	}
	
}
