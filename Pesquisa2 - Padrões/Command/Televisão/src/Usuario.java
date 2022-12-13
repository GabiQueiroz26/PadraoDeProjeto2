public class Usuario {
    public static void main(String[] args) throws Exception {
        Televisao tv = new Televisao("LG");
        System.out.println(tv.modeloTv);
        tv.executarAcao("Botão da esquerda", new LigarTv());
        tv.executarAcao("Botão do meio", new MudarCanal());
        tv.executarAcao("Botão da direita", new DesligarTv());

        System.out.println();
        Televisao tv2 = new Televisao("Samsung");
        System.out.println(tv2.modeloTv);
        tv2.executarAcao("Botão do meio", new MudarCanal());
    }
}
