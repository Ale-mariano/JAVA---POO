package projeto03;
public class Peixe extends Animal {
    private String corEsma;

    @Override
    public void locomover() {
        System.out.println("Nanando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo susbstancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolha");
        
     }

    public String getCorEsma() {
        return corEsma;
    }

    public void setCorEsma(String corEsma) {
        this.corEsma = corEsma;
    }
    
}
