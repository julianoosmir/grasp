package Service;

import Product.Transporte;

import java.util.UUID;

interface TransportCrud extends ServicoCrud<Transporte> {
    void deletar(UUID id);
}
