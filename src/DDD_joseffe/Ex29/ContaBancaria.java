package DDD_joseffe.Ex29;

public class ContaBancaria {
    String agencia;
    String numero;
    double saldo;

    ContaBancaria(){
}
    ContaBancaria(String agencia, String numero, Double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }
}
