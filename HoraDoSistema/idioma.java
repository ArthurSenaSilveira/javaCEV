package HoraDoSistema;

import java.util.Locale;

public class idioma {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();

        System.out.println("O seu sistema esta em" + locale.getDisplayLanguage());
        System.out.println("País: " + locale.getDisplayCountry());
    }
}
