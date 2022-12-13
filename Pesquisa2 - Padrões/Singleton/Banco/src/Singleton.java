public class Singleton {
  
  private static Singleton instanciaSingleton;

  public static Singleton getIstancia(){
    if (instanciaSingleton == null)
      instanciaSingleton =  new Singleton();
      return instanciaSingleton;
  }

  private Banco banco;

  public void AbrirConta(int valor){
    banco = new Banco(valor);
  }

  public void depositar(int valor){
    banco.setTotal(banco.getTotal() + valor);
  }

  public void sacar(int valor){
    banco.setTotal(banco.getTotal() - valor);
  }

  public Banco getBanco(){
    return banco;
  }

}
