package bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MesaTest {

    @Test
    public void deveRetornarPrecoMesaMadeira() {
        Material material = new Madeira();
        Mesa mesa = new Mesa(material, 200.0);
        assertEquals(300.0f, mesa.obterPreco(), 0.01f);
    }

    @Test
    public void deveRetornarPrecoMesaMetal() {
        Material material = new Metal();
        Mesa mesa = new Mesa(material, 200.0);
        assertEquals(400.0f, mesa.obterPreco(), 0.01f);
    }
}