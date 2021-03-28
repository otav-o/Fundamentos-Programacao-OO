/*
    Um professor tem seu salário mensal calculado a partir do número
    de aulas ministradas ao mês. Por exemplo, uma disciplina de 4 créditos
    semanais, são 16 horas mensais.
    O valor por hora depende da formação do professor:
    - se for graduado, o valor da hora-aula é R$ 25,00,
    - se possuir especialização, há um acréscimo de 15%,
    - se for mestre, um aumento de 45%,
    - e se for doutor há um aumento de 75%.

    Todos os aumentos ocorrem sobre o valor da hora-aula.
    Se a disciplina for EAD, o valor por hora-aula diminui em 25%.
    Faça um sistema que permita cadastrar um professor, suas disciplinas e calcular o salário
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var prof = new Professor("Daves", 4);

        cadastrarDisciplinas(prof);

        var salarioMensal = prof.calcularSalario(25);

        System.out.println("O salário deste professor é " + salarioMensal);
    }

    private static void cadastrarDisciplinas(Professor prof) {
        prof.addDisciplina(new Disciplina("FPOO", 4, false));
        prof.addDisciplina(new Disciplina("Sistemas Operacionais", 4, true));
        prof.addDisciplina(new Disciplina("Padrões de Projeto", 2, false));
        prof.addDisciplina(new Disciplina("Redes de Computadores", 6, true));
    }
}
