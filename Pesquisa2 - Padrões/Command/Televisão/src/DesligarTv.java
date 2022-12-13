public class DesligarTv implements ControleComand {

    @Override
    public void realizarAcao(Acao acao) {
        System.out.println("Você desligou a TV " + acao.clicar(null) );
        
    }
    
}
