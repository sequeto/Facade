package facade;

import static org.junit.Assert.*;

import org.junit.Test;

public class facadeTest {
	
	@Test
    public void deveRetornarReprovacaoFinanceiro() {
        Pedido pedido = new Pedido();
        Financeiro.getInstancia().realizarReprovacao(pedido);

        assertEquals(false, pedido.realizarPedido());
    }

    @Test
    public void deveRetornarReprovacaoAdministrativo() {
    	Pedido pedido = new Pedido();
        Administrativo.getInstancia().realizarReprovacao(pedido);

        assertEquals(false, pedido.realizarPedido());
    }

    @Test
    public void deveRetornarAprovacaoFinanceiro() {
        Pedido pedido = new Pedido();
        Financeiro.getInstancia().realizarAprovacao(pedido);

        assertEquals(false, pedido.realizarPedido());
    }

    @Test
    public void deveRetornarAprovacaoAdministrativo() {
    	Pedido pedido = new Pedido();
        Administrativo.getInstancia().realizarAprovacao(pedido);

        assertEquals(false, pedido.realizarPedido());
    }
    
    @Test
    public void deveRetornarPedidoAprovado() {
    	Pedido pedido = new Pedido();
        Administrativo.getInstancia().realizarAprovacao(pedido);
        Financeiro.getInstancia().realizarAprovacao(pedido);

        assertEquals(true, pedido.realizarPedido());
    }

}
