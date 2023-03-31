package bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CadeiraTest {

    @Test
    public void deveRetornarPrecoCadeiraMadeira() {
        Material material = new Madeira();
        Cadeira cadeira = new Cadeira(material, 200.0);
        assertEquals(300.0f, cadeira.obterPreco(), 0.01f);
    }

    @Test
    public void deveRetornarPrecoCadeiraMetal() {
        Material material = new Metal();
        Cadeira cadeira = new Cadeira(material, 200.0);
        assertEquals(400.0f, cadeira.obterPreco(), 0.01f);
    }
}