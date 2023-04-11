package calculadorabeneficios;

public class CalculadoraCompleja implements Calcular{

	private double mSales; //entiendase por Montlhly Sales
	private double benefit;
	public double getmSales() {
		return mSales;
	}
	public void setmSales(double mSales) {
		this.mSales = mSales;
	}
	public double getBenefit() {
		return benefit;
	}
	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}
	
	@Override
	public double calcular(double mSales) {
		benefit = 0.01;
		if(mSales > 500 && mSales <1000) {
			return mSales *(benefit+0.02);
		}
		if (mSales > 1000 && mSales <5001) {
			return mSales*(benefit+0.05);
		}
		if (mSales >5000) {
			return (mSales*(benefit+0.05))+100;
		} else {
			return mSales*benefit;
		}
		
	}
	
	
	

}
