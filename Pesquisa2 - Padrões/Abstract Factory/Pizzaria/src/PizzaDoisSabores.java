public class PizzaDoisSabores implements Pizzaria {

  @Override
  public PizzaDoce fazerPizzaDoce() {
    return new Nutella();
  }

  @Override
  public PizzaSalgada fazerPizzaSalgada() {
    return new Strogonoff();
  }
  
}
