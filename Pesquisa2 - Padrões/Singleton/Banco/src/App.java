public class App {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getIstancia();
        Singleton singleton2 = Singleton.getIstancia();
        System.out.println(singleton);
        System.out.println(singleton2);

        /* O exemplo mostra que nos dois casos vai imprimir a mesma coisa, ou seja o mesmo objeto com sua respectiva
         * posição de memória, com isso podemos chamar getInstancia() quantas vezes quiser que sempre vai retornar
         * o mesmo objeto.
         */
     
    }
}
