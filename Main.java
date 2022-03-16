import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   static Scanner s = new Scanner(System.in);

   public static void main(String args[]) {

      int quantidade;

      ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

      System.out.println("Quantos funcionários serão inseridos?");
      quantidade = s.nextInt();
      
      //Foreach para popular os funcionários
      for(int i = 0; i < quantidade; i++) {

         System.out.printf("Funcionário %d de %d:\n", i+1, quantidade);

         System.out.println("Informe o código do funcionário: ");
         int codigo = s.nextInt();

         System.out.println("Informe o tipo de funcionário: (1 para concursado e 2 para temporário)");
         int tipo = s.nextInt();

         Funcionario funcionario = Funcionario.novo(tipo);
         funcionario.setCodigo(codigo);
         funcionario.setTipo(tipo);

         System.out.println("Informe o salário do funcionário: ");
         funcionario.setSalario_base(s.nextDouble());

         System.out.printf("Informe o tempo de contratado: (em %s)\n", funcionario.getTempoDescricao());
         funcionario.setTempo(s.nextInt());

         System.out.println("Informe a quantidade de dependentes: ");
         int quantidade_dependentes = s.nextInt();

         for (int j = 0; j < quantidade_dependentes; j++ ) {
            System.out.printf("Informe a idade do dependente %d: ", j + 1);
            funcionario.getDependentes().add(new Dependente(s.nextInt()));
         }

         funcionarios.add(funcionario);

      }

      //mostra os resultados
      System.out.println("\nResultados: \n");
      for(int i = 0; i < funcionarios.size(); i++) {
         System.out.printf("Funcionário %d:\n", i+1);
         funcionarios.get(i).imprime();
      }
   }

}