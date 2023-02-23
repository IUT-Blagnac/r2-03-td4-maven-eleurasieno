public class ClasseEssai {
	public static double plusPlus (double pfA, int pfD) {
		double res;

		res = pfA + pfD + 1;
		return res;
	}
	/*
	 * programme main qui s'exécute automatiquement
	 * @param argv
	 */
	public static void main(String[]  argv) {
		double ageDebut;
		int anneesEtudes;
		double ageFinEtudes;

		ageDebut = 23; // 1
		anneesEtudes = 5 ;
		ageFinEtudes = ClasseEssai.plusPlus (ageDebut, anneesEtudes); // 2
		System.out.println ("Votre age en fin de parcours d'études : " + ageFinEtudes);// 3
	}
}