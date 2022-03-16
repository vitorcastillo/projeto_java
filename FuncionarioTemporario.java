public class FuncionarioTemporario extends Funcionario{

   int meses;

   @Override
   public int getTempo() {
      // TODO Auto-generated method stub
      return meses;
   }

   @Override
   public String getTempoDescricao() {
      // TODO Auto-generated method stub
      return "meses";
   }

   @Override
   public void setTempo(int meses) {
      // TODO Auto-generated method stub
      this.meses = meses;
   }

   @Override
   public double calculaSalario() {
      // TODO Auto-generated method stub
      return this.getSalario_base() + (this.getTempo() * 15.00) + (quantidadeDependentesContabilizados() * 50.00);
   }

   @Override
   public int quantidadeDependentesContabilizados() {

      int quantidade = 0;

      // TODO Auto-generated method stub
      for(int i = 0; i < this.getDependentes().size(); i++) {
         if (this.getDependentes().get(i).getIdade() <= 18) {
            quantidade++;
         }
      }

      return quantidade;
   }

   @Override
   public void imprime() {
      // TODO Auto-generated method stub
      super.imprime();

      System.out.printf("---- Meses de contratação: %d\n---- Quantidade de dependentes: %d\n---- Quantidade de dependentes válidos para o calculo: %d\n", this.getTempo(), this.getDependentes().size(), quantidadeDependentesContabilizados());
      System.out.printf("---- Adicional dos dependentes: %.2f\n---- Adicional por meses de contrato: %.2f\n\n", (quantidadeDependentesContabilizados() * 50.00), (this.getTempo() * 15.00));
   }

}