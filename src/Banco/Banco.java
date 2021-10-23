package Banco;

import Product.Transporte;

import java.util.ArrayList;
import java.util.List;

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
}
