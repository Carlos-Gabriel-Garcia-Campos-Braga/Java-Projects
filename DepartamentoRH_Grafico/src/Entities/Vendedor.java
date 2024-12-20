package Entities;

import Entities.Empregado;
import Entities.Pessoa;
import Util.Validations;

public class Vendedor extends Empregado{
		private Double valorVendas;
		private Double comissao;
		
		public Vendedor(Integer codigoSetor, Pessoa Pessoa)
		{
			super(Pessoa, codigoSetor);
		}
		
		public Double getValorVendas() 
		{
			return valorVendas;
		}
		
		public void setValorVendas(String valorVendasInput) {
		    if (isValorVendasValid(valorVendasInput)) {
		        this.valorVendas = Double.parseDouble(valorVendasInput);
		    } else {
		        System.out.println("Digite um valor válido!");
		    }
		}
		
		public boolean isValorVendasValid(String valorVendas)
		{
			return Validations.isNumeroDecimalValido(valorVendas);
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
			return super.calcularSalario() + (valorVendas * comissao);
		}
		
		public String toString()
		{
			return super.toString();
		}
		
}
