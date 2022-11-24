package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Departamento {
	private String responsavel;
	private List<Pedido> pedidosAprovados = new ArrayList<Pedido>();
	private List<Pedido> pedidosReprovados= new ArrayList<Pedido>();

    public boolean realizarAprovacao(Pedido pedido) {
        pedidosAprovados.add(pedido);
        return true;
    }
    
    public boolean realizarReprovacao(Pedido pedido) {
        pedidosReprovados.add(pedido);
        return true;
    }
    
    public boolean verificarPedidosAprovados(Pedido pedido) {
        return this.pedidosAprovados.contains(pedido);
    }

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
}
