public class App {
    public static void main(String[] args) throws Exception {
        Mangá mangá = new Mangá();

        LivroPrototype livroNovo = mangá.clonagem();
        livroNovo.setQtdLivros(28);
        LivroPrototype livroVelho = mangá.clonagem();
        livroVelho.setQtdLivros(2);

        System.out.println(livroNovo.caracteristicas());
        System.out.println("Possui " + livroNovo.qtdLivros + " unidades de mangás novos");
        System.out.println();
        System.out.println(livroVelho.caracteristicas());
        System.out.println("Possui " + livroVelho.qtdLivros + " unidades de mangás velhos");
    }
}
