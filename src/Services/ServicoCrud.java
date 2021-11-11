package Services;

import Banco.Banco;

import java.util.List;

public interface ServicoCrud<T> {
    Banco banco = new Banco();
    // suponha-se que seja uma classe de conexao com banco
    void inserir(T o);
    List<T> buscarTodos();
}
