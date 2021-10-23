package CreateFactory;

import ConcretProduct.Barco;
import Creator.TransporteFactory;
import Product.Transporte;

public class BarcoFactory extends TransporteFactory {

    private Double _tempoDeViagem;
    private Double _preco;

    public BarcoFactory(Double tempoDeViagem, Double preco) {
        this._tempoDeViagem = tempoDeViagem;
        this._preco = preco;
    }

    @Override
    public Transporte getTransporte() {
        return new Barco(_tempoDeViagem,_preco);
    }
}
