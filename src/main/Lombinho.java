
package main;

import main.PizzaRecheioDecorator.TamanhoPizza;

public class Lombinho implements Pizza {

    public TamanhoPizza tamanhoPizza;
    public boolean borda;
    

    public Lombinho(String tamanhoPizza, boolean borda) {
        this.tamanhoPizza = TamanhoPizza.valueOf(tamanhoPizza);
        this.borda = borda;
    }


    @Override
    public float getPrecoPizza() {
        switch (tamanhoPizza) {
            case PEQUENA:
                return (float) 55.99;
            case MEDIA:
                return (float) 75.99;
            case GRANDE: 
                return (float) 85.99;
            default:
                return (float) 75.99;
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