package Service;

import Product.Transporte;

import java.util.List;
import java.util.UUID;

public class ServiceTransporte implements TransportCrud {
    @Override
    public void inserir(Transporte o) {
        this.banco.AdicinarTrasporte(o);
    }

    @Override
    public List<Transporte> buscarTodos() {
       return this.banco.getTransporteList();
    }

    @Override
    public void deletar(UUID id) {
        this.banco.RemoverTranporte(id);
    }
}
