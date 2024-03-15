
public class Programa {

    public static void main(String[] args) {

        String texto1 = "100";
        String texto2 = "50";
        // Concatenação
        String txtFinal = texto1 + texto2;
        System.out.println("texto: " + txtFinal);

        // Parsear (Converter)
        int numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);
        int resultado = Calculadora.somar(numero1, numero2);
        System.out.println("Resultado: " + resultado);

        // Doubles
        double variavel = 10.60;
        Double objeto = 10.50;

        // Objetos do tipo Bike
        Bike objetoMinhaBike = new Bike();
        objetoMinhaBike.marca = "Caloi";
        int novaMarcha;
        objetoMinhaBike.alterarMarcha(3);

        Bike objetoSuaBike = new Bike();
        objetoSuaBike.marca = "Oggi";
        objetoSuaBike.alterarMarcha(5);

        System.out.println("Minha bike marca: " + objetoMinhaBike.marca);
        System.out.println("Minha bike marcha: " + objetoMinhaBike.marchaAtual);

        System.out.println();

        System.out.println("Sua bike marca: " + objetoSuaBike.marca);
        System.out.println("Sua bike marcha: " + objetoSuaBike.marchaAtual);

        System.out.println();

        String matricula;
        String[] matriculas;

        // Bike.marca = "Caloi";
        // Bike.marchaAtual = 3;

        // ----------------------------------------------Aula anterior
        // // Pinto inicial do programa
        // exibirMenuInicial();

        // }

        // public static void exibirMenuInicial() {

        // // Mostrar o menu

        // // String matricula;
        // // String nome;
        // // Double nota1;
        // // Double nota2;

        // // Vetores com dados de 5 alunes
        // String[] matriculas = new String[5];
        // String[] nomes = new String[5];
        // double[] notas1 = new double[5];
        // double[] notas2 = new double[5];

        // // Matriz com dados dos 5 alunes
        // String[][] dadosAlunos = new String[4][5];

        // // Structs ou classes/objetos

        // Aluno a1 = new Aluno();
        // a1.matricula = "A";
        // a1.nome = "nome1";
        // a1.nota1 = 5;
        // a1.nota2 = 8;

        // Aluno a2 = new Aluno();
        // Aluno a3 = new Aluno();
        // Aluno a4 = new Aluno();
        // Aluno a5 = new Aluno();

    }

}