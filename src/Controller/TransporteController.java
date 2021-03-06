package Controller;

import Product.Transporte;
import Services.Products.ServiceTransporte;

import java.util.List;
import java.util.UUID;

public class TransporteController {

    private ServiceTransporte serviceTransporte = new ServiceTransporte();

    public List<Transporte> buscarTodos() {
        return serviceTransporte.buscarTodos();
    }

    public void inserir(Transporte transporte) {
        serviceTransporte.inserir(transporte);
    }

    public void deletar(UUID id) {
        serviceTransporte.deletar(id);
    }
}
