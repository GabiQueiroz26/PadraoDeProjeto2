public class App {
    public static void main(String[] args) {

       Pizzaria pizza = new PizzaDoisSabores();
       PizzaSalgada ps = pizza.fazerPizzaSalgada();
       PizzaDoce pd = pizza.fazerPizzaDoce();
       System.out.println("Fazendo Pizza de dois sabores:\nMetade: ");
       ps.elementosPizzaSalgada();
       System.out.println("Outra metade: ");
       pd.elementosPizzaDoce();
       System.out.println();

       pizza = new PizzaUmSaborDoce();
       System.out.println("Fazendo Pizza de um sabor: ");
       pd.elementosPizzaDoce();
       System.out.println();

       pizza = new PizzaUmSaborSalgada();
       System.out.println("Fazendo pizza de um sabor: ");
       ps.elementosPizzaSalgada();



    }
}
