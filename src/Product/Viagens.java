package Product;

import java.util.List;

public class Viagens {
    private List<Transporte> transportes;
    private Double total;

    public Viagens(List<Transporte> transportes) {
        this.transportes = transportes;
        this.total = 0.0;
    }

    public List<Transporte> getTransportes() {
        return transportes;
    }

    public void setTransportes(Transporte transporte) {
        this.transportes.add(transporte);
    }

    public Double getTotal() {
        for (Transporte transporte : this.transportes){
            this.total += transporte.getPreco();
        }

        return this.total;
    }


}
