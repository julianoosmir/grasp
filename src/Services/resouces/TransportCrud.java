package Services.resouces;

import Product.Transporte;
import Services.ServicoCrud;

import java.util.UUID;

public interface TransportCrud extends ServicoCrud<Transporte> {
    void deletar(UUID id);
}
