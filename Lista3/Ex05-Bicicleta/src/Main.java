import Bicicleta.Acessorios.GarrafaDeAgua;
import Bicicleta.Acessorios.Lanterna;
import Bicicleta.Bicicleta;

public class Main {

    public static void main(String[] args) {
        Bicicleta b = new Bicicleta(29, 7, 10, 50, false);
        Bicicleta b2 = new Bicicleta(29, 7, 10, 50, true);


        System.out.println(b.getPreco());
        System.out.println(b2.getPreco());


        b.addAcessorio(
                new Lanterna(10, true),
                new GarrafaDeAgua(1000, false)
        );

        System.out.println(b.getPreco());

    }
}
