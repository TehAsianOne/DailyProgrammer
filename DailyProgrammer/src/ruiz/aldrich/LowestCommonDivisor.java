package ruiz.aldrich;

public class LowestCommonDivisor 
{
	public static void main(String[] args)
	{
		Fraction fraction = new Fraction(51478, 5536);
		System.out.println(fraction.getNumerator() / FindGreatestCommonDivisor(fraction) + " " + fraction.getDenominator() / FindGreatestCommonDivisor(fraction));
	}

	private static int FindGreatestCommonDivisor(Fraction fraction)
	{
		int newA = fraction.getNumerator();
		int newB = fraction.getDenominator();
		int remainder = 0;
		
		if(newA == 0 || newB == 0)
		{
			return newB;
		}
		else
		{
			remainder = newB % newA;
			
			return FindGreatestCommonDivisor(new Fraction(remainder, newA));
		}
	}
}
