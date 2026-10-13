package Academia;

import java.util.List;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) {

    List<Notificavel> lista = new ArrayList<>();


PlanoMensal plano1 = new PlanoMensal(100);
Aluno aluno1 = new Aluno("João", plano1);
Aluno aluno2 = new Aluno("Rafa", plano1);
Aluno aluno3 = new Aluno("Luiz", plano1);
Instrutor instrutor = new Instrutor("Roberto", "Personal");

lista.add(aluno1);
lista.add(instrutor);

for (Notificavel m : lista) {
    m.notificar("Precisa Treinar mais");
}
Turma turma = new Turma("Turma", instrutor, 2);


try {turma.matricular(aluno3);
    turma.matricular(aluno1);
    turma.matricular(aluno2);
} catch (TurmaLotadaException e) {
   System.out.println(e.getMessage());
}

turma.notificarTodos("Aula Amanhã às 7h");



}

}