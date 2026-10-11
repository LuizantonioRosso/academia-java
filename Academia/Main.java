package Academia;

import java.util.List;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) {

    List<Notificavel> lista = new ArrayList<>();
    
PlanoMensal plano1 = new PlanoMensal(100);
Aluno aluno = new Aluno("João", plano1);
Instrutor instrutor = new Instrutor("Roberto", "Personal");

lista.add(aluno);
lista.add(instrutor);

for (Notificavel m : lista) {
    m.notificar("Precia Treinar mais");
}


}

}