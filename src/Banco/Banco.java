package Banco;

import Product.Transporte;
import Product.Viagens;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Banco {
    private List<Transporte> transporteList;
    private List<Viagens> viagens;

    public Banco() {
        this.transporteList = new ArrayList<>();
        this.viagens = new ArrayList<>();
    }

    public List<Viagens> getViagens() {
        return this.viagens;
    }

    public void setViagens(Viagens viagens) {
        this.viagens.add(viagens);
    }

    public void AdicinarTrasporte(Transporte transporte) {
        this.transporteList.add(transporte);
    }

    public List<Transporte> getTransporteList() {
        return transporteList;

    }

    public void RemoverTranporte(UUID id) {
        this.transporteList.removeIf(t -> t.getId() == id);
    }
}
