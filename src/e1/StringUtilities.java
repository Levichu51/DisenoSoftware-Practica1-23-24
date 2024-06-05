package e1;

public class StringUtilities {
    public static boolean isValidString(String s, String n, int max) {
        if(s == null || s.isEmpty()){ //si es nulo o esta vacio, no es valido
            return false;

        }else if(s.length() < max){ //si la longitud del string es menor que el parametro de tipo int que se pasa no es valido
            return false;
        }else{
            for(char c : s.toCharArray()){ //recorre el string pasando a un vector de caracteres
                if(!Character.isDigit(c) &&  n.indexOf(c) == -1){ //está verificando si un carácter no es un dígito y no está en la cadena n
                    return false;
                }
            }

        }return true;

    }

    public static String lowercaseFirst(String in) {
        int i;

        if (in == null) {
            throw new IllegalArgumentException("String not valid"); //si es nulo devuelve una excepcion

        } else {
            StringBuilder minus = new StringBuilder(); //se crean minus y mayus de la clase StringBuilder para el uso de appends
            StringBuilder mayus = new StringBuilder();

            for (i = 0; i < in.length(); i++){ //se recorre el string y se mete en la variable c para ir comparando cada letra
                char c = in.charAt(i);

                if(Character.isLowerCase(c)){ //si es minus se añade a la cadena de minus
                    minus.append(c);
                }else if(Character.isUpperCase(c)){ //lo mismo con mayus
                    mayus.append(c);
                }
            }
            return minus.toString() + mayus.toString(); //se suman las cadenas, primero la de minusculas
        }
    }


    public static boolean checkTextStats(String s, int min, int max) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("String no válido");
        }

        if (min <= 0 || max <= 0) {
            throw new IllegalArgumentException("Min-Max no válido");
        }
        //excepciones en caso de que sea nulo, vacio o no cumpla los parametros de min y max

        String[] palabras = s.split(" "); //separamos el string por palabras
        int totalPalabras = palabras.length;
        int sumaLongitudes = 0;
        int longitudPalabraMasLarga = 0;

        for (String palabra : palabras) { //recorre de palabra en palabra y lo guarda en palabra la actual
            int longitudPalabra = palabra.length();
            sumaLongitudes += longitudPalabra;

            if (longitudPalabra > longitudPalabraMasLarga) {
                longitudPalabraMasLarga = longitudPalabra;
            }
        }

        float longitudMedia = (float) sumaLongitudes / totalPalabras;

        return longitudMedia >= min && longitudMedia <= max && longitudPalabraMasLarga <= 2 * longitudMedia;
    }




}
