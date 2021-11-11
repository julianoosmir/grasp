package Services.resouces;

import Product.Viagens;
import Services.ServicoCrud;

public interface ViagenCrud extends ServicoCrud<Viagens> {
    public Double getTotal();
}
