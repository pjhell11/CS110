package chap10;

public class TaxTest {
	
	public static void main(String[] args) {
		int[][] bracketsFor2001 = {{27050, 65550, 136750, 297350},
		{45200, 109250, 166500, 297350},
		{22600, 54625, 83250, 148675},
		{36250, 93650, 151650, 297350}};

		double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

		int[][] bracketsFor2009 = {{8350, 33950, 82250, 17150, 372950},
		{16700 , 67900, 137050, 208850, 372950},
		{8350, 33950, 68525, 104425, 186475},
		{11950, 45500, 117450, 190200, 372950}};

		double[] ratesFor2009 = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};

		Tax taxFor2001 = new Tax(0, bracketsFor2001, ratesFor2001, 50000);
		System.out.println("2001 Tax Table");
		System.out.println("Income\tSingle\tM-joint\tM-sep\tH.o.H.");

		for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
			
			taxFor2001.setTaxableIncome(taxableIncome);
			
			int[] taxForStatus01 = new int[4];

			for (int i = 0; i < 4; i++) {
				taxFor2001.setFilingStatus(i);
				taxForStatus01[i] = (int)taxFor2001.findTax();
			}

			System.out.println(taxableIncome + "\t" + taxForStatus01[0] + "\t" + taxForStatus01[1] + "\t" + taxForStatus01[2] + "\t" + taxForStatus01[3]);
		}
		
		System.out.println();

		Tax taxFor2009 = new Tax(0, bracketsFor2009, ratesFor2009, 50000);
		System.out.println("2009 Tax Table");
		System.out.println("Income\tSingle\tM-joint\tM-sep\tH.o.H.");
		
		for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
			
			taxFor2009.setTaxableIncome(taxableIncome);
			
			int[] taxForStatus09 = new int[4];

			for (int i = 0; i < 4; i++) {
				taxFor2009.setFilingStatus(i);
				taxForStatus09[i] = (int)taxFor2009.findTax();
			}

			System.out.println(taxableIncome + "\t" + taxForStatus09[0] + "\t" + taxForStatus09[1] + "\t" + taxForStatus09[2] + "\t" + taxForStatus09[3]);
		}
	}
}
