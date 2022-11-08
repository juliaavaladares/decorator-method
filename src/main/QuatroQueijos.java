package main;

public class QuatroQueijos extends PizzaRecheioDecorator {

    public TamanhoPizza tamanhoPizza;
    public boolean borda;
    

    public QuatroQueijos(Pizza pizza, TamanhoPizza tamanhoPizza, boolean borda) {
        super(pizza);
        this.tamanhoPizza = tamanhoPizza;
        this.borda = borda;
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


    @Override
    public float getPrecoFinalPizza() {
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

}