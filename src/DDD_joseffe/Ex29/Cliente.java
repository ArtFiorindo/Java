package DDD_joseffe.Ex29;

public class Cliente {
    int id;
    String nome;
    int idade;
    String email;
    ContaBancaria conta;


Cliente() {
}

Cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.email = email;
    this.conta = conta;
}
public void atualizarEmail (String novoEmail){
    this.email = novoEmail;

    }

        public String exibirNomeIdade(){
            return (this.nome + '-' + this.idade);
        }

        public String exibirDadosConta(){
            if(this.conta != null){
                return("conta: " + this.conta);
            }
            else{
                return("Cliente sem conta");
             }
        }

    }




