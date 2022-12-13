public class PizzaUmSaborSalgada implements Pizzaria {

  @Override
  public PizzaDoce fazerPizzaDoce() {
    return null;
  }

  @Override
  public PizzaSalgada fazerPizzaSalgada() {
    return new Strogonoff();
  }
  
}
