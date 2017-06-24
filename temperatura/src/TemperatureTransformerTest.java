import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TemperatureTransformerTest{
	
//	@Test
//    public void testConvert1() throws Exception{
//        Temperature t = new FahrenheitTemperature();
//        t.setValue(32);
//        TemperatureTransformer tc = new TemperatureTransformer();
//        Temperature c = tc.convert(t);
//        assertTrue(c.getValue() == 0);
//    }    
//  
	@Test
    public void testConvertToFahrenheit() throws Exception{
		Map<Integer, Integer> mapaTemperatura = new HashMap<>();
		mapaTemperatura.put(0, 32);
		mapaTemperatura.put(100, 212);
		mapaTemperatura.put(-273, -459);
        
		Set<Integer> listaTemperatura = mapaTemperatura.keySet();
		for (Integer temperatura : listaTemperatura){
			Temperature t = new CelsiusTemperature();
	        t.setValue(temperatura);
	        TemperatureTransformer tc = new TemperatureTransformer();
	        Temperature c = tc.convert(t);
	        assertTrue("convertendo o valor : "+ temperatura, c.getValue() == mapaTemperatura.get(temperatura));	
		}
		
		
    } 
} 
