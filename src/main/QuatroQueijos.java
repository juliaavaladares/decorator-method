package main;

import main.PizzaRecheioDecorator.TamanhoPizza;

public class QuatroQueijos implements Pizza {

    public TamanhoPizza tamanhoPizza;
    public boolean borda;
    

    public QuatroQueijos(String tamanhoPizza, boolean borda) {
        this.tamanhoPizza = TamanhoPizza.valueOf(tamanhoPizza);
        this.borda = borda;
    }


    @Override
    public float getPrecoPizza() {
        switch (tamanhoPizza) {
            case PEQUENA:
                return (float) 25.99;
            case MEDIA:
                return (float) 45.99;
            case GRANDE: 
                return (float) 65.99;
            default:
                return (float) 45.99;
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