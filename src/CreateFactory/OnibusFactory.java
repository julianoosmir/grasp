package CreateFactory;

import ConcretProduct.Onibus;
import Creator.TransporteFactory;
import Product.Transporte;

public class OnibusFactory extends TransporteFactory {

    private Double _tempoDeViagem;
    private Double _preco;

    public OnibusFactory(Double tempoDeViagem, Double preco) {
        this._tempoDeViagem = tempoDeViagem;
        this._preco = preco;
    }

    @Override
    public Transporte getTransporte() {
        return new Onibus(_tempoDeViagem,_preco);
    }
}
