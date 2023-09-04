public class Carro {
    private String chassi;
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferinfo cambio");
    }
}
