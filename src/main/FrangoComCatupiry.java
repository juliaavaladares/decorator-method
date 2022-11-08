
package main;

public class FrangoComCatupiry extends PizzaRecheioDecorator {

    public TamanhoPizza tamanhoPizza;
    public boolean borda;
    

    public FrangoComCatupiry(Pizza pizza, String tamanhoPizza, boolean borda) {
        super(pizza);
        this.tamanhoPizza = TamanhoPizza.valueOf(tamanhoPizza);
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
                precoFinal = (float) 35.99;
            case MEDIA:
                precoFinal = (float) 55.99;
            case GRANDE: 
                precoFinal = (float) 75.99;
            default:
                precoFinal = (float) 0.0;
        }

        if (borda) {
            precoFinal = (float) (precoFinal * 1.2);
        }

        return precoFinal;


    }

}