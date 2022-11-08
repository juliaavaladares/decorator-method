
package main;

import main.PizzaRecheioDecorator.TamanhoPizza;

public class FrangoComCatupiry implements Pizza {

    public TamanhoPizza tamanhoPizza;
    public boolean borda;
    

    public FrangoComCatupiry(String tamanhoPizza, boolean borda) {
        this.tamanhoPizza = TamanhoPizza.valueOf(tamanhoPizza);
        this.borda = borda;
    }


    @Override
    public float getPrecoPizza() {
        switch (tamanhoPizza) {
            case PEQUENA:
                return (float) 35.99;
            case MEDIA:
                return (float) 55.99;
            case GRANDE: 
                return (float) 75.99;
            default:
                return (float) 55.99;
        }
        
    }


    public TamanhoPizza getTamanhoPizza() {
        return tamanhoPizza;
    }


    public void setTamanhoPizza(TamanhoPizza tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }


    public boolean isBorda() {
        return borda;
    }


    public void setBorda(boolean borda) {
        this.borda = borda;
    }

}