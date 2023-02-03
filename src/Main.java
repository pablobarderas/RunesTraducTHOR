import runesUtils.Runes;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {

        // Runes Utils
        Runes r = new Runes();

        // MOSTRAR RUNAS Y LETRA CORRESPONDIENTE
        r.showRunes();

        // PEDIR DATO AL USUARIO
        StringBuilder response = new StringBuilder(JOptionPane.showInputDialog("Input word to translate"));

        // TRADUCIR PALABRA
        StringBuilder translation = r.translate(String.valueOf(response), r.alphabet());

        System.out.println(translation);

    }


}
