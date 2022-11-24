package facade;


public class CompraFacade {
	public static boolean verificarAprovacoes(Pedido pedido) {
        if(Financeiro.getInstancia().verificarPedidosAprovados(pedido) && Administrativo.getInstancia().verificarPedidosAprovados(pedido)) {
        	return true;
        }
        
        return false;
    }
}
