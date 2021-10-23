package Product;

import java.util.UUID;

public abstract class Transporte {

    private UUID id = UUID.randomUUID();
    public String tipo;
    public Double tempoDeViagem;
    public Double preco;

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
