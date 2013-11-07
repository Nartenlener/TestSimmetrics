import java.io.Console;

import uk.ac.shef.wit.simmetrics.similaritymetrics.*;


public class SimMetrics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tekst1 = "Jakiœ Bardzo ciekawy tekst";
		String tekst2 = "Jakiœ bardzo ciekawy tekst";
		
		Double[] wynik = new Double[2];
		wynik = porownywanie(tekst1, tekst2);
		
		System.out.println("wynik algorytmu Jaro: " + wynik[0]);
		System.out.println("wynik algorytmu Jaccard: " + wynik[1]);

	}
	
	public static Double[] porownywanie(String s1, String s2)
	{
		Double[] wynik = new Double[2];
		
		JaroWinkler jaroWinkler = new JaroWinkler();
		JaccardSimilarity jaccardSimilarity = new JaccardSimilarity();
		
		wynik[0] = (double) jaroWinkler.getSimilarity(s1, s2);
		wynik[1] = (double) jaccardSimilarity.getSimilarity(s1, s2);		
		return wynik;
	}


}
