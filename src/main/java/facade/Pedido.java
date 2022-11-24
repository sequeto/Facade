package facade;

public class Pedido {
	public boolean realizarPedido() {
        return CompraFacade.verificarAprovacoes(this);
    }
}
