package main;

import main.PizzaRecheioDecorator.TamanhoPizza;

public class Recheio implements Pizza{
    
    public TamanhoPizza tamanhoPizza;
    public boolean borda;

    public Recheio() {}

    public Recheio(String tamanhoPizza, boolean borda) {
        this.tamanhoPizza = TamanhoPizza.valueOf(tamanhoPizza);
        this.borda = borda;
    }

    @Override
    public float getPrecoPizza() {
        return (float) 55.99;
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
