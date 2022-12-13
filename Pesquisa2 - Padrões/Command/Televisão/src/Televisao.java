public class Televisao {
    protected String modeloTv;

    public Televisao(String modeloTv) {
        this.modeloTv = modeloTv;
    }



    public void executarAcao(String botão, ControleComand mexerTV ){
        Acao acao = new Acao(modeloTv);
        acao.clicar(botão);
        mexerTV.realizarAcao(acao);
    }

    
}
