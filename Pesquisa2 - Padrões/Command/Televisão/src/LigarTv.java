public class LigarTv implements ControleComand {

    @Override
    public void realizarAcao(Acao acao) {
        System.out.println("Você ligou a tv "+ acao.clicar(null));
     
    }
    
}
