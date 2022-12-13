public class Mangá extends LivroPrototype {


    public Mangá(Mangá mangá) {
        super();
        this.qtdLivros = mangá.getQtdLivros();
    }

    public Mangá(){
        qtdLivros = 0;
    }

    @Override
    public String caracteristicas() {
        return "Tipo: Livro japonês\nQuantidade disponível: 30 unidades";
    }

    @Override
    public LivroPrototype clonagem() {
        return new Mangá(this);
    }
    
}
