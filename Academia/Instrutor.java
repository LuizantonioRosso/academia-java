package Academia;


public class Instrutor implements Notificavel {
  
 private String nome;
 private String especialidade;

public Instrutor (String nome, String especialidade) {
    this.nome = nome;
    this.especialidade = especialidade;

}

public String getNome() {
    return nome;
}

public String getEspecialidade() {
    return especialidade;
}

@Override 
public void notificar(String mensagem) {
  System.out.println("Nome: " + getNome() + " Mensagem " + mensagem);
}



}