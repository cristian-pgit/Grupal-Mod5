package calculadorabeneficios;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraComplejaTest {

	private CalculadoraCompleja cc = new CalculadoraCompleja();
	
    @Test
    public void testCalcular1() {
    	double mSales = 5000.0;
    	double expectedBeneficio = 300.0;
        double delta = 0.01;
        double actualBeneficio = cc.calcular(mSales);
        assertEquals(expectedBeneficio, actualBeneficio, delta);
    }
    
    
    @Test
    public void testCalcular2() {
    	double mSales = 5400.0;
    	double esperado = 424.0;
        double delta = 0.01;
        double beneficioActual = cc.calcular(mSales);
        assertEquals(esperado, beneficioActual, delta);
    }
    
    @Test
    public void testCalcular3() {
    	double mSales = 0.0;
    	double expectedBeneficio = 0.0;
        double delta = 0.01;
        double actualBeneficio = cc.calcular(mSales);
        assertEquals(expectedBeneficio, actualBeneficio, delta);
    }
}