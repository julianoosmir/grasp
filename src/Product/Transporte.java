package Product;

import java.util.UUID;

public abstract class Transporte {

    protected UUID id = UUID.randomUUID();
    protected String tipo;
    protected Double tempoDeViagem;
    protected Double preco;

    public UUID getId() {
        return id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTempoDeViagem() {
        return this.tempoDeViagem;
    }

    public void setTempoDeViagem(Double tempoDeViagem) {
        this.tempoDeViagem = tempoDeViagem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
