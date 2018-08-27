/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cronos;

/**
 *
 * @author leobilliMac
 */
public class Cronos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int seconds = 60;
         long time, time1;
         	//a variavel time vai receber a hora atual do sistema em milisegundos
            time = System.currentTimeMillis();
            //enquanto o tempo do sistema atual - o tempo do sistema recebido na chamada do metodo for menor q o tempo 
            //q o usuario colocou para aquecer o loop continuara, quando sair irá mostrar a msg q o aquecimento esta
            //pronto.
            do {
                time1 = System.currentTimeMillis();
                System.out.println("ola"); 	
            } while ((time1 - time) < (seconds * 1000)) ;
            System.out.println("Pronto!");
        
        
        
        
    }
    
}
