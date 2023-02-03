package runesUtils;

import java.util.HashMap;

public class Runes {

    // FUTHARK ASOCIADO AL ABECEDARIO
    public HashMap<Character, Character> alphabet(){

        // ALFABETO
        HashMap<Character, Character> alphabet = new HashMap<>();

        // ASIGNAR VALORES
        alphabet.put('f','\u16A0');
        alphabet.put('u','\u16A2');
        alphabet.put('t','\u16A6');
        alphabet.put('a','\u16A8');
        alphabet.put('r','\u16B1');
        alphabet.put('k','\u16B2');
        alphabet.put('v','\u16B9');
        alphabet.put('g','\u16B7');
        alphabet.put('w','\u16B9');
        alphabet.put('h','\u16BA');
        alphabet.put('n','\u16BE');
        alphabet.put('i','\u16C1');
        alphabet.put('j','\u16C3');
        alphabet.put('y','\u16C7');
        alphabet.put('p','\u16C8');
        alphabet.put('z','\u16C9');
        alphabet.put('s','\u16CB');
        alphabet.put('b','\u16D2');
        alphabet.put('e','\u16D6');
        alphabet.put('m','\u16D7');
        alphabet.put('l','\u16DA');
        alphabet.put('o','\u16DF');
        alphabet.put('d','\u16DE');
        alphabet.put('c','\u16B2');
        alphabet.put('q','\u16B2');
        alphabet.put('x','\u16DD');

        return alphabet;

    }

    // Mostrar runas y letras del abecedario
    public void showRunes() {

        // BUCLE PARA ITERAR EN HASMAP
        for (Character letra: alphabet().keySet()) {
            System.out.println("Letra: " + letra + "\tRuna: " + alphabet().get(letra));
        }
    }

    // TRADUCTOR
    public StringBuilder translate(String cadena, HashMap map) {

        StringBuilder traduccion = new StringBuilder();
        cadena = cadena.toLowerCase();

        // TRADUCIR CADENA OBTENIENDO CADA VALOR SEGUN CADA LETRA DE LA CADENA
        for (int letra = 0; letra < cadena.length(); letra++) {

            // SI LA LETRA NO ESTÁ
            if(!map.containsKey(cadena.charAt(letra))){
                System.out.println("El alfabeto rúnico no contiene la letra " + cadena.charAt(letra));
                break;
            }

            traduccion.append(map.get(cadena.charAt(letra)));
        }

        return traduccion;
    }

}
