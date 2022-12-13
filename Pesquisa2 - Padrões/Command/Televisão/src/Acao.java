public class Acao {
    public String botão;

    public Acao(String botão) {
        this.botão = botão;
    }

    public String getBotão() {
        return botão;
    }

    public void setBotão(String botão) {
        this.botão = botão;
    }

    public String clicar(String botão){
        return new String("ao clicar no botão");
    }
    
}
