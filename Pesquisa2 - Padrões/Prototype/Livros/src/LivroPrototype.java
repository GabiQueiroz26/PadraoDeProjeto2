public abstract class LivroPrototype {
    
    protected int qtdLivros;

    public abstract String caracteristicas();
    public abstract LivroPrototype clonagem();

    public int getQtdLivros() {
        return qtdLivros;
    }
    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    
}
