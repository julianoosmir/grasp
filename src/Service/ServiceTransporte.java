package Service;

import Product.Transporte;

import java.util.List;

public class ServiceTransporte implements TransportCrud {
    @Override
    public void inserir(Transporte o) {
        this.banco.AdicinarTrasporte(o);
    }

    @Override
    public List<Transporte> buscarTodos() {
       return this.banco.getTransporteList();
    }
}
