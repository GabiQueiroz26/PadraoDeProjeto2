public class MudarCanal implements ControleComand {

    @Override
    public void realizarAcao(Acao acao) {
        System.out.println("Você mudou de canal " + acao.clicar(null));
        
    }
    
}
