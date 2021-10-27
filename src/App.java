import Controller.TransporteController;
import CreateFactory.AviaoFactory;
import CreateFactory.BarcoFactory;
import CreateFactory.OnibusFactory;
import Creator.TransporteFactory;
import Product.Transporte;
import Product.Viagens;

import javax.swing.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        TransporteController Controller = new TransporteController();

        Controller.inserir(inserirDados());

        Controller.inserir(inserirDados());

        Controller.inserir(inserirDados());

        Viagens viagens = new Viagens(Controller.buscarTodos());

        Double valor = viagens.getTotal();

    }

    static Transporte inserirDados(){
        TransporteFactory transporteFactory = null;
        int option = apenaNumeros("1 para onibus , 2 para barco e 3 para aviao");

        transporteFactory = inserirOpcoes(transporteFactory,option);
        Transporte transporte = transporteFactory.getTransporte();

        return transporte;
    }

    static TransporteFactory inserirOpcoes(TransporteFactory transporteFactory, int option){
        if (option == 1) {
            transporteFactory = new OnibusFactory(1.2, 2500.2);
        }
        if (option == 2) {
            transporteFactory = new BarcoFactory(11.2, 45.2);
        }
        if (option == 3) {
            transporteFactory = new AviaoFactory(23.3, 350.2);
        }
        return  transporteFactory;
    }
    static int apenaNumeros(String mensagem) {
        Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
        String input = JOptionPane.showInputDialog(mensagem);
        Matcher m = p.matcher(input);
        if (m.find()) {
            JOptionPane.showMessageDialog(null, "apenas numeros");
            return apenaNumeros(mensagem);
        } else {
            return Integer.parseInt(input);
        }
    }
}
