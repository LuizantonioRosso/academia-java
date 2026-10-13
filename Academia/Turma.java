package Academia;

import java.util.ArrayList;
import java.util.List;

public class Turma {

   private List<Aluno> turma = new ArrayList<>();

   private String nome;
   private Instrutor instrutor;
   private int capacidade;
  

   public Turma(String nome, Instrutor instrutor, int capacidade) {
    this.nome = nome;
    this.instrutor = instrutor;
    this.capacidade = capacidade;

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
}
