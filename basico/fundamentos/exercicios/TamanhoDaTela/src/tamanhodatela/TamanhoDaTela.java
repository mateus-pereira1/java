package tamanhodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class TamanhoDaTela {

 
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int) tamanhoTela.getWidth();
        int altura = (int) tamanhoTela.getHeight();
        
        System.out.println("A resolução da tela é: "+largura+" x "+altura);
        
    }
    
}
