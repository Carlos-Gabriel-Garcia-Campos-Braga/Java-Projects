package Entities;

import Entities.Pessoa;
import Util.Validations;

public class Empregado extends Pessoa{
		private Integer codigoSetor;
		private Double salarioBase;
		private Double imposto;
		
		public Empregado(Pessoa Pessoa, Integer codigoSetor)
		{
			super(Pessoa.getNome(), Pessoa.getEndereco(), Pessoa.getTelefone(), Pessoa.getCargo(), Pessoa.getSexo(), Pessoa.getDataNascimento());
			this.codigoSetor = codigoSetor;
		}
		
		public void setCodigoSetor(String codigoSetorInput) {
		    if (isCodigoSetorValid(codigoSetorInput))
		        this.codigoSetor = Integer.parseInt(codigoSetorInput);
		    else
		        System.out.println("Digite um valor válido!");
		}

		public boolean isCodigoSetorValid(String codigoSetorInput)
		{
			return Validations.isNumberValid(codigoSetorInput);
		}
		
		
		public Integer getCodigoSetor() 
		{
			return codigoSetor;
		}
		
		public void setImposto(String impostoInput) 
		{
		    if (isImpostoValid(impostoInput)) 
		    {
		        this.imposto = Double.parseDouble(impostoInput);
		    } 
		    else 
		    {
		        System.out.println("Digite um valor válido!");
		    }
		}

		public boolean isImpostoValid(String impostoInput)
		{
			return Validations.isNumeroDecimalValido(impostoInput);
		}
		
		
		public Double getSalarioBase() {
			return salarioBase;
		}
		
		public void setSalarioBase(String salarioBaseInput) {
		    if (isSalarioValid(salarioBaseInput)) 
		    {
		        this.salarioBase = Double.parseDouble(salarioBaseInput);
		    } 
		    else 
		    {
		        System.out.println("Digite um valor válido!");
		    }
		}
		
		public boolean isSalarioValid(String salarioBaseInput)
		{
			return Validations.isNumeroDecimalValido(salarioBaseInput);
		}

		
		
		public Double getImposto() 
		{
			return imposto;
		}
		
		public Double calcularSalario()
		{
			return salarioBase - (salarioBase * (imposto / 100));
		}
		
		
		@Override
		
		public String toString()
		{
			return super.toString() +
				   "\nSalario: " + calcularSalario();
		}
		
}
