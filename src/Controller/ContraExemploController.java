package Controller;

import Banco.Banco;
import Product.Transporte;

import java.util.List;
import java.util.UUID;

public class ContraExemploController {

    private Banco banco = new Banco();

    public List<Transporte> buscarTodos() {
        return this.banco.getTransporteList();
    }

    public void inserir(Transporte transporte) {
        this.banco.AdicinarTrasporte(transporte);
    }

    public void deletar(UUID id) {
        this.banco.RemoverTranporte(id);
    }

}
