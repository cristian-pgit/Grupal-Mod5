package calculadorabeneficios;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraSimpleTest {

	private CalculadoraSimple cs = new CalculadoraSimple();
	
    @SuppressWarnings("deprecation")
	@Test
    public void testCalcular() {
    	double mSales = 5000.0;
    	double expectedBeneficio = 150.0;
        double delta = 0.01;
        double actualBeneficio = cs.calcular(mSales);
        assertEquals(expectedBeneficio, actualBeneficio, delta);
    }


}