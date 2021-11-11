package Services.Products;

import Product.Viagens;
import Services.resouces.ViagenCrud;

import java.util.List;

public class ServiceViagem implements ViagenCrud {
    @Override
    public void inserir(Viagens o) {
        this.banco.setViagens(o);
    }

    @Override
    public List<Viagens> buscarTodos() {
        return this.banco.getViagens();
    }

    @Override
    public Double getTotal() {
        return this.banco.getViagens().stream().mapToDouble(x-> x.getTotal()).sum();
    }
}
