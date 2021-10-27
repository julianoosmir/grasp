package Banco;

import Product.Transporte;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Banco {
     private  List<Transporte> transporteList;

    public Banco() {
        this.transporteList = new ArrayList<>();
    }
    public void AdicinarTrasporte(Transporte transporte){
        this.transporteList.add(transporte);
    }

    public List<Transporte> getTransporteList() {
        return transporteList;

    }
    public void RemoverTranporte(UUID id){
        this.transporteList.removeIf(t-> t.getId() == id);
    }
}
