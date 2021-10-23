package Service;

import Banco.Banco;
import Product.Transporte;

import java.util.List;

public interface ServicoCrud<T> {
    Banco banco = new Banco();
    void inserir(T o);
    List<T> buscarTodos();
}
