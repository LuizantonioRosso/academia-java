package Academia;

import java.util.ArrayList;
import java.util.List;

public class Turma {

   private List<Aluno> turma = new ArrayList<>();

   private String nome;
   private Instrutor instrutor;
   private int capacidade;
  

   public Turma(String nome, Instrutor instrutor, int capacidade) {

    if (capacidade <= 0) {
        throw new IllegalArgumentException("Capacidade Inválida: "+ capacidade);
    }
    this.capacidade = capacidade;
    this.nome = nome;
    this.instrutor = instrutor;

   }

   public String getNome() {
    return nome;
   }

   public Instrutor getInstrutor() {
    return instrutor;
   }

   public int getCapacidade() {
    return capacidade;
   }

   public void matricular(Aluno aluno) throws TurmaLotadaException {

    if (!turma.contains(aluno)) {
        if (turma.size() >= capacidade){
            throw new TurmaLotadaException("Turma cheia");
        }
        turma.add(aluno);
    }

   }

   public void notificarTodos(String mensagem) {
      List<Notificavel> todos = new ArrayList<>();
      todos.add(instrutor);
      todos.addAll(turma);


      for (Notificavel destinario : todos) {
        destinario.notificar(mensagem);
      }

   }

   public void listarMensalidades() {
   
   for (Aluno aluno : turma) {
    System.out.println("Aluno: " + aluno.getNome() + " Mensalidade: "+ aluno.getPlano().calcularMensalidade());
    
   }
    
   }
}
