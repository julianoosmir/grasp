package Service;

import Banco.Banco;
import Product.Transporte;

import java.util.List;

public interface ServicoCrud<T> {
    Banco banco = new Banco();
    // suponha-se que seja uma classe de conexao com banco
    void inserir(T o);
    List<T> buscarTodos();
}
