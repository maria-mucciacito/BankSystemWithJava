import java.util.ArrayList;

public class Conto{
    private int numeroConto;
    private double saldo = 0.0;
    ArrayList<String> operazioniEffetuate = new ArrayList<String>();
    private Cliente cliente;

    public Conto(int numConto, int saldo, Cliente cliente){
        this.numeroConto = numConto;
        this.saldo = saldo;
        this.cliente = cliente;

    }

    public String toString(){
        return "Conto " + numeroConto + " intestato a cliente " + " con saldo " + saldo + " £";
    }
}