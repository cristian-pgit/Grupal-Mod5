package calculadorabeneficios;

public class CalculadoraSimple implements Calcular {
	
	private double mSales; //entiendase por Montlhly Sales
	private double benefit= 0.03;

	@Override
	public double calcular(double mSales) {
		 
		return mSales * benefit;
	}

	public double getMsales() {
		return mSales;
	}

	public void setMsales(double msales) {
		mSales = mSales;
	}

	public double getBenefit() {
		return benefit;
	}

	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}

	
	
}
