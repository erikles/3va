package negocio;
import java.util.List;

import entidades.Cliente;
import entidades.OrdemServico;
import repositorios.RepositorioOrdemServico;

public class ControladorOrdemServico {
	private static ControladorOrdemServico instancia;
	private RepositorioOrdemServico reOS;
	
	private ControladorOrdemServico() {
		reOS = new RepositorioOrdemServico();
	}
	
	public static ControladorOrdemServico getInstancia() {
		if ( instancia == null  )
			instancia= new ControladorOrdemServico();
		return instancia;
	}
	
	public boolean inserir(OrdemServico ordemServico) {
    	return reOS.inserir(ordemServico);
    }
	public List<OrdemServico> localizarTodos() {
		return reOS.localizarTodos();
	} 
		
	
}
