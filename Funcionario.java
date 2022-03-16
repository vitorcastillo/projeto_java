import java.text.DecimalFormat;
import java.util.ArrayList;

public class Funcionario {
   
   private int codigo;
   private int tipo; //1 para concursado e 2 para temporário
   private double salario_base;

   private ArrayList<Dependente> dependentes = new ArrayList<Dependente>();

   Funcionario()
   {

   }

   //Getters
   public int getCodigo() {
      return codigo;
   }
   public int getTipo() {
      return tipo;
   }
   public double getSalario_base() {
      return salario_base;
   }
   public int getTempo() {
      return 0;
   }
   public String getTempoDescricao()
   {
      return "";
   }
   public ArrayList<Dependente> getDependentes() {
      return dependentes;
   }


   //Setters
   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }  
   public void setTipo(int tipo) {
      this.tipo = tipo;
   }
   public void setSalario_base(double salario_base) {
      this.salario_base = salario_base;
   }
   public void setTempo(int tempo) {

   }

   @Override
   public String toString() {

      DecimalFormat formatter = new DecimalFormat("#0.00");

      // TODO Auto-generated method stub
      return  String.valueOf(codigo) + ": " + formatter.format(calculaSalario());
      
   }

   public void imprime() {
      String descricao_tipo = tipo == 1 ? "Concursado" : "Temporário";
      System.out.printf("---- Código: %s\n---- Tipo: %s\n---- Salário base: %.2f\n---- Salário total: %.2f\n", codigo, descricao_tipo, salario_base, calculaSalario());
      System.out.println("--------------------------------------");
   }

   public double calculaSalario()
   {
      return 0;
   }

   //Cria a classe do funcionário com base no tipo
   public static Funcionario novo(int tipo)
   {
      if (tipo == 1) {
         return new FuncionarioConcursado();
      }
      else {
         return new FuncionarioTemporario();
      }
   }

   
   public int quantidadeDependentesContabilizados()
   {
      return dependentes.size();
   }

}