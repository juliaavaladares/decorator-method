
package main;

public class Lombinho extends PizzaRecheioDecorator {

    public TamanhoPizza tamanhoPizza;
    public boolean borda;
    

    public Lombinho(Pizza pizza, TamanhoPizza tamanhoPizza, boolean borda) {
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
        float precoFinal;
        switch (tamanhoPizza) {
            case PEQUENA:
                precoFinal = (float) 55.99;
            case MEDIA:
                precoFinal = (float) 75.99;
            case GRANDE: 
                precoFinal = (float) 85.99;
            default:
                precoFinal = (float) 0.0;
        }

        if (borda) {
            precoFinal = (float) (precoFinal * 1.2);
        }

        return precoFinal;
    }

}