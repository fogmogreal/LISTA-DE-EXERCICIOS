
public class Programa {

    public static void main(String[] args) {
        // Pinto inicial do programa
        exibirMenuInicial();

    }

    public static void exibirMenuInicial() {

        // Mostrar o menu

        // String matricula;
        // String nome;
        // Double nota1;
        // Double nota2;

        // Vetores com dados de 5 alunes
        String[] matriculas = new String[5];
        String[] nomes = new String[5];
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];

        // Matriz com dados dos 5 alunes
        String[][] dadosAlunes = new String[4][5];

        // Structs ou classes/objetos

        Alune a1 = new Alune();
        a1.matricula = "A";
        a1.nome = "nome1";
        a1.nota1 = "5";
        a1.nota2 = "8";

        Alune a2 = new Alune();
        Alune a3 = new Alune();
        Alune a4 = new Alune();
        Alune a5 = new Alune();

    }

}