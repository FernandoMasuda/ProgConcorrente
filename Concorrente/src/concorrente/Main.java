package Concorrente;

public class Main {
    public static void main(String[] args) {
        Ponte p = new Ponte();
        
        Veiculo v1 = new Veiculo(p);
        v1.setPriority(1);
        Veiculo v2 = new Veiculo(p);
        v2.setPriority(1);
        Veiculo v3 = new Veiculo(p);
        v3.setPriority(1);
        Veiculo v4 = new Veiculo(p);
        v4.setPriority(1);
        Veiculo v5 = new Veiculo(p);
        v5.setPriority(1);
        Veiculo v6 = new Veiculo(p);
        v6.setPriority(5);
        Veiculo v7 = new Veiculo(p);
        v7.setPriority(10);
        
        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
        v6.start();
        v7.start();
    }       
}
