package ruiz.aldrich;

public class Fraction 
{
	private int numerator, denominator;
	
	public Fraction(int a, int b)
	{
		numerator = a;
		denominator = b;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public String toString()
	{
		return String.valueOf(numerator) + " " + String.valueOf(denominator);
	}
}
