package calculadorabeneficios;

import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DemoConsola {
	
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();
	static CalculadoraSimple cs = new CalculadoraSimple();
	static CalculadoraCompleja cc = new CalculadoraCompleja();


	public static void main(String[] args) {
		
		List<Double> sales = new ArrayList<Double>();
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);
		sales.add(rn.nextDouble(2000)+100);

		double mSales = 0;
		for(int i=0; i < sales.size(); i++) {
		    mSales += sales.get(i);
		}

		double beneficioObtcs = cs.calcular(mSales);
		double beneficioObtcc = cc.calcular(mSales);
		
		int venDmes = (int)Math.round(mSales);
		int benOcs = (int)Math.round(beneficioObtcs);
		int benOcc = (int)Math.round(beneficioObtcc);
		
		System.out.println("La venta mensual fue de: "+venDmes);
		System.out.println("El Beneficio que obtiene el trabajador obtuvo con un calculo simple es "+ benOcs+ " US$");
		System.out.println("El Beneficio que obtiene el trabajador obtuvo con un calculo complejo es "+ benOcc+ " US$");


	}

}
