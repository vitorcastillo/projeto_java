public class FuncionarioConcursado extends Funcionario{

   int anos;

   @Override
   public int getTempo() {
      // TODO Auto-generated method stub
      return anos;
   }

   @Override
   public String getTempoDescricao() {
      // TODO Auto-generated method stub
      return "anos";
   }

   @Override
   public void setTempo(int anos) {
      // TODO Auto-generated method stub
      this.anos = anos;
   }

   @Override
   public double calculaSalario() {
      // TODO Auto-generated method stub
      return this.getSalario_base() + (this.getTempo() * 200.00) + (quantidadeDependentesContabilizados() * 100.00);
   }
   
   @Override
   public int quantidadeDependentesContabilizados() {

      int quantidade = 0;

      // TODO Auto-generated method stub
      for(int i = 0; i < this.getDependentes().size(); i++) {
         if (this.getDependentes().get(i).getIdade() <= 21) {
            quantidade++;
         }
      }

      return quantidade;
   }

   @Override
   public void imprime() {
      // TODO Auto-generated method stub
      super.imprime();

      System.out.printf("---- Anos de contratação: %d\n---- Quantidade de dependentes: %d\n---- Quantidade de dependentes válidos para o calculo: %d\n", this.getTempo(), this.getDependentes().size(), quantidadeDependentesContabilizados());
      System.out.printf("---- Adicional dos dependentes: %.2f\n---- Adicional por anos de contrato: %.2f\n\n", (quantidadeDependentesContabilizados() * 100.00), (this.getTempo() * 200.00));
   }
}