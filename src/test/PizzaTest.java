package test;

import org.junit.jupiter.api.Test;

import main.*;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveRetornarPrecoPizzaRecheioPadrao(){
        
        Pizza pizza = new Recheio("PEQUENA", false);

        float precoEsperado = (float) 55.99;

        assertEquals(precoEsperado, pizza.getPrecoPizza());
    }

    @Test
    void deveRetornarPrecoPizzaRecheioFrangoPequena(){
        Recheio recheio = new Recheio();
        Pizza pizzaFrango = new FrangoComCatupiry(recheio, "PEQUENA", false);

        float precoEsperado = (float) 35.99;

        assertEquals(precoEsperado, pizzaFrango.getPrecoPizza());
    }

    @Test
    void deveRetornarPrecoPizzaRecheioFrangoMedia(){
        Recheio recheio = new Recheio();
        Pizza pizzaFrango = new FrangoComCatupiry(recheio, "MEDIA", false);

        float precoEsperado = (float) 55.99;

        assertEquals(precoEsperado, pizzaFrango.getPrecoPizza());
    }

    // @Test
    // void deveRetornarPrecoPizzaFrangoGrandeComBorda(){
    //     Pizza pizzaFrango = new FrangoComCatupiry("GRANDE", true);

    //     float precoEsperado = (float) (75.99 * 1.2);

    //     assertEquals(precoEsperado, pizzaFrango.getPrecoPizza());
    // }
    
}
