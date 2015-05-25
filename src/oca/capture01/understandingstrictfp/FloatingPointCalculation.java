package oca.capture01.understandingstrictfp;

public class FloatingPointCalculation {
  private final int big = 1234567890; 
  private final float approx = big; 
 
	public double calc() {
		return big - (int)approx;
	}

	public strictfp double calcPlatformSafe() {
		return big - (int)approx;
	}
}
