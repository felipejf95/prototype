public class Jogador implements Cloneable{
    String nome;
    int numero;
    Posicao posicao;

    public Jogador(String nome, int numero, Posicao posicao) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString(){
        return "Jogador: "+ nome+ ", Numero: "+numero + ", Posicao: "+posicao;
    }

    @Override
    public Jogador clone() throws CloneNotSupportedException {
        Jogador jogadorClone = (Jogador)super.clone();
        jogadorClone.posicao = (Posicao) jogadorClone.posicao.clone();
        return jogadorClone;
    }
}
