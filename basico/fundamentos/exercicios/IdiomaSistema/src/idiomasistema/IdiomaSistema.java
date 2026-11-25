package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        
        String idiomaSistema = idioma.getDisplayLanguage();
        
        
        System.out.println("O idioma do sistema é: "+idiomaSistema);
    }
    
}
