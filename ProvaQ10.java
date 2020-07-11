/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaq10;

/**
 *
 * @author yasmi
 */
public class ProvaQ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int cont, soma;

        cont =  0 ;
        soma =  0 ;

        while (cont > = 0 e  & cont <= 500 ) {
        cont ++ ;
        if (cont % 2  ! =  0 e  & cont % 3  ==  0 ) {
        soma + = cont;
        }
        }

        JOptionPane . showMessageDialog ( null , " Soma dos números múltiplos de"
                + " três entre 0 e 500 é: "  + soma);

    }

}

    

