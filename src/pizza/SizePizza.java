/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Gabriel
 */
public class SizePizza {

    int qntSabores;
    double valorTamanho;
    double valorCborda;
    String tamanho;
    int validador = 0;
    EdgeFlavor edgeflavor = new EdgeFlavor();

    public int selectSize(int op) {

        switch (op) {
            case 1:
                qntSabores = 5;
                tamanho = "Gigante";
                valorTamanho = 75;
                valorCborda = 80;
                break;

            case 2:
                qntSabores = 4;
                tamanho = "Familia";
                valorTamanho = 66;
                valorCborda = 69.5;
                break;

            case 3:
                qntSabores = 3;
                tamanho = "Media";
                valorTamanho = 52;
                valorCborda = 56.5;
                break;

            case 4:
                qntSabores = 3;
                tamanho = "Pequena";
                valorTamanho = 42;
                valorCborda = 44.5;
                break;

            case 5:
                qntSabores = 2;
                tamanho = "Broto";
                valorTamanho = 28;
                validador = 1;
                break;
        }
        return qntSabores;
    }
}