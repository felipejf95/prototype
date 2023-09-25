public class Posicao implements Cloneable{
    String posicao;
    String setor;

    public Posicao(String posicao, String setor) {
        super();
        this.posicao = posicao;
        this.setor = setor;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return posicao + ", Setor: "+ setor;
    }
}
