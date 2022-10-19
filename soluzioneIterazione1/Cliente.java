public class Cliente {
    private String nomeCliente;
    private String numeroTelefono; 

    public Cliente(String nome, String numero){
        this.nomeCliente = nome;
        this.numeroTelefono = numero;
    }

    public String toString(){
        return "Cliente " + nomeCliente + " telefono " + numeroTelefono;
    }
}
