public class PizzaUmSaborDoce implements Pizzaria {

  @Override
  public PizzaDoce fazerPizzaDoce() {
    return new Nutella();
  }

  @Override
  public PizzaSalgada fazerPizzaSalgada() {
    return null;
  }
  
}
