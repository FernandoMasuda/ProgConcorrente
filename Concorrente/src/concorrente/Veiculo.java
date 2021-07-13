package Concorrente;

public class Veiculo extends Thread {
    Ponte p;
    
    public Veiculo(Ponte p){
        this.p = p;
    }
    
    public void run(){
        String veiculo;
        int prioridade = this.getPriority();
        
        switch (prioridade) {
            case 10:
                veiculo = "Ambulância";
                break;
            case 5:
                veiculo = "Polícia";
                break;
            default:
                veiculo = "Comum";
                break;
        }
                               
        p.ultrapassar();
        System.out.println("Veículo passando: " + veiculo);
    }    
}