package Entities;

import Entities.Empregado;
import Entities.Pessoa;
import Util.Validations;

public class Administrador extends Empregado{
		private Double ajudaDeCusto = 0.20;
		
		public Administrador(Integer codigoSetor, Pessoa Pessoa)
		{
			super(Pessoa, codigoSetor);
		}
		
		public void setAjudaDeCusto(String ajudaDeCustoInput) 
		{
		    if (isAjudaDeCustoValid(ajudaDeCustoInput)) 
		        this.ajudaDeCusto = Double.parseDouble(ajudaDeCustoInput);
		    else
		        System.out.println("Digite um valor válido!");  
		}
		
		public boolean isAjudaDeCustoValid(String ajudaDeCustoInput)
		{
			return Validations.isNumeroDecimalValido(ajudaDeCustoInput);
		}
		
		public Double getAjudaDeCusto() 
		{
			return ajudaDeCusto;
		}

		@Override
		
		public Double calcularSalario()
		{
			return super.calcularSalario() + (getSalarioBase() * ajudaDeCusto);
		}
		
		public String toString()
		{
			return super.toString();				
		}
		
}
