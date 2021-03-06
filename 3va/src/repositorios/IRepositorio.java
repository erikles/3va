package repositorios;

import java.util.List;

public interface IRepositorio<T> {
	public T localizar(String id);
	public List<T> localizarTodos();
	public boolean inserir(T obj);
}
