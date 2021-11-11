package Controller;

import Services.Products.ServiceViagem;

public class ViagemController {
    private ServiceViagem serviceViagem = new ServiceViagem();

    public Double getTotal(){
        return serviceViagem.getTotal();
    }


}
