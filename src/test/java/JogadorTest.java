import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Jogador jogador = new Jogador("Ronaldo", 9, new Posicao("Centroavante", "Ataque"));

        Jogador jogadorClone = jogador.clone();
        jogadorClone.setNome("Ronaldinho Gaucho");
        jogadorClone.setNumero(10);
        jogadorClone.getPosicao().setPosicao("Meia");

        assertEquals("Jogador: Ronaldo, Numero: 9, Posicao: Centroavante, Setor: Ataque", jogador.toString());
        assertEquals("Jogador: Ronaldinho Gaucho, Numero: 10, Posicao: Meia, Setor: Ataque", jogadorClone.toString());

    }


}