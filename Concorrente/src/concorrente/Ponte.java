package Concorrente;

import java.util.logging.Logger;
import java.util.logging.Level;
import static java.lang.Thread.sleep;

public class Ponte {
    String p[];
    int tamanho;
    
    public Ponte(){
        this.p = new String[1];
        this.tamanho = 0;
    }
    
    public synchronized void ultrapassar(){
            while(tamanho == 1){
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ponte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            this.tamanho = 1;
            
        try {
            sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ponte.class.getName()).log(Level.SEVERE, null, ex);
        }
            notifyAll();
            this.tamanho = 0;
    }  
}