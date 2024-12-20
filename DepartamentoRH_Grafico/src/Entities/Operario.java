package Entities;

import Entities.Empregado;
import Entities.Pessoa;
import Util.Validations;

public class Operario extends Empregado{
		private Double valorProducao;
		private Double comissao;
		
		public Operario(Integer codigoSetor, Pessoa Pessoa )
		{
			super(Pessoa, codigoSetor);
		}
		
		public Double getValorProducao() 
		{
			return valorProducao;
		}
		
		public void setValorProducao(String valorProducaoInput) {
		    if (isValorProducaoValid(valorProducaoInput)) {
		        this.valorProducao = Double.parseDouble(valorProducaoInput);
		    } else {
		        System.out.println("Digite um valor válido!");
		    }
		}
		
		public boolean isValorProducaoValid(String valorProducao)
		{
			return (Validations.isNumeroDecimalValido(valorProducao));
		}

		
		public Double getComissao() 
		{
			return comissao;
		}
		
		public void setComissao(String comissaoInput) {
		    if (isComissaoValid(comissaoInput)) {
		        this.comissao = Double.parseDouble(comissaoInput);
		    } else {
		        System.out.println("Digite um valor válido!");
		    }
		}

		
		public boolean isComissaoValid(String Comissao)
		{
			return Validations.isNumeroDecimalValido(Comissao);
		}
		
		@Override
		
		public Double calcularSalario()
		{
			return super.calcularSalario() + (valorProducao * (comissao / 100));
		}
		
		public String toString()
		{
			return super.toString();
		}
		
		
}
