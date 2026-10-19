package Academia;

import java.util.List;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) {

    List<Notificavel> lista = new ArrayList<>();
    List<Notificavel> listanova = new ArrayList<>();


PlanoMensal plano1 = new PlanoMensal(100);
PlanoTrimestral plano2 = new PlanoTrimestral(100);
PlanoAnual plano3 = new PlanoAnual(100);

Aluno aluno1 = new Aluno("João", plano1);
Aluno aluno2 = new Aluno("Rafa", plano1);
Aluno aluno3 = new Aluno("Luiz", plano1);
Aluno alunotrimestral = new Aluno("José", plano2);
Aluno alunoAnual = new Aluno("Maria", plano3);
Aluno alunoMensal = new Aluno("Robera", plano1);
Instrutor instrutor = new Instrutor("Roberto", "Personal");
Instrutor instrutorNova = new Instrutor("Gabriela", "mulheres");


lista.add(aluno1);
lista.add(instrutor);


for (Notificavel m : lista) {
    m.notificar("Precisa Treinar mais");
}
Turma turma = new Turma("Turma", instrutor, 2);
Turma turma2 = new Turma("Nova turma", instrutorNova, 3);

try {turma2.matricular(alunoMensal);
    turma2.matricular(alunotrimestral);
    turma2.matricular(alunoAnual);
} catch (TurmaLotadaException e) {
    System.out.println(e.getMessage());
}

try {turma.matricular(aluno3);
    turma.matricular(aluno1);
    turma.matricular(aluno2);   
} catch (TurmaLotadaException e) {
   System.out.println(e.getMessage());
}


turma.notificarTodos("Aula Amanhã às 7h");

turma.listarMensalidades();
turma2.listarMensalidades();

}

}