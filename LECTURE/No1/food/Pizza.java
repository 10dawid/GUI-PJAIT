package LECTURE.No1.food;

public class Pizza {
    private String ciasto;
    private String sos;
    private String skladniki;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.ciasto = pizzaBuilder.ciasto;
        this.sos = pizzaBuilder.sos;
        this.skladniki = pizzaBuilder.skladniki;
    }

    public static class PizzaBuilder{
        private String ciasto;
        private String sos;
        private String skladniki;



        public PizzaBuilder setCiasto(String ciasto){
            this.ciasto = ciasto;
            return this;
        }

        public PizzaBuilder setSos(String sos){
            if (this.ciasto == null) throw new IllegalStateException("brak ciasta");
            else{
                this.sos = sos;
                return this;
            }
        }
        public PizzaBuilder setSkladniki(String skladniki){
            if (this.sos == null) throw new IllegalStateException("brak sosu");
            else{
                this.skladniki = skladniki;
                return this;
            }
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
