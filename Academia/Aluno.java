package Academia;

public class Aluno implements Notificavel {

private String nome;
private Plano plano;

public Aluno(String nome , Plano plano) {
    this.nome = nome;
    this.plano = plano;
}

@Override 
public void notificar(String mensagem) {
    System.out.println("Notificação para " + nome + ": " + mensagem);
}

public String getNome() {
    return nome;
}

public Plano getPlano() {
    return plano;
}


}
