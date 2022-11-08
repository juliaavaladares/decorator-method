package main;

public abstract class PizzaRecheioDecorator implements Pizza{

    private Pizza pizza;
    public enum TamanhoPizza{
        PEQUENA,
        MEDIA,
        GRANDE
    }
    public boolean borda;

    public PizzaRecheioDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }


    public boolean isBorda() {
        return borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    public abstract float getPrecoFinalPizza();

    public float getPrecoPizza(){
        if (borda) {
            return (float) (this.pizza.getPrecoPizza() * 1.2);
        }

        return (float) (this.pizza.getPrecoPizza());
        
    }
    
}
