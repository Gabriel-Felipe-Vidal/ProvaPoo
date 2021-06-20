/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Flavor {

    double valorSabor;
    SizePizza size = new SizePizza();
    ArrayList<String> listaSabores = new ArrayList();

    Order order = new Order();

    public ArrayList selectFlavor(int op) {

        switch (op) {
            case 1:
                listaSabores.add("5 Queijos");
                break;
            case 2:
                listaSabores.add("Frango Catupiry");
                break;
            case 3:
                listaSabores.add("Cheddar");
                valorSabor += 3.50;
                break;
            case 4:
                listaSabores.add("Calabresa");
                break;
            case 5:
                listaSabores.add("Chocolate");
                break;
            case 6:
                listaSabores.add("Prestigio");
                break;
            case 7:
                listaSabores.add("Salmao com alcaparras");
                valorSabor += 4;
                break;
            case 8:
                listaSabores.add("Camarao");
                valorSabor += 4.5;
                break;
            case 9:
                listaSabores.add("Abacaxi com Canela");
                break;
        }

        return listaSabores;
    }

}