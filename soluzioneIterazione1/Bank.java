import java.util.ArrayList;;

public class Bank {
    private String nomeBanca;
    ArrayList<Integer> clienti = new ArrayList<Integer>();
    ArrayList<Integer> contiCorrenti = new ArrayList<Integer>();

    public Bank(String nome){
        this.nomeBanca = nome;
    }

    public String toString(){
        return "Nome Banca " + nomeBanca + " numero totale di clienti " + clienti.size() + " numero totale di conti correnti " + contiCorrenti.size();
    }
}
