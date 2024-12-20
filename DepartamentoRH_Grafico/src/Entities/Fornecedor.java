package Entities;

import Entities.Pessoa;
import Util.Validations;

public class Fornecedor extends Pessoa{
	private Double valorCredito;
	private Double valorDivida;
	
	public Fornecedor(Pessoa Pessoa)
	{
		super(Pessoa.getNome(), Pessoa.getEndereco(), Pessoa.getTelefone(), Pessoa.getCargo(), Pessoa.getSexo(), Pessoa.getDataNascimento());
	}
	
	public void setValorCredito(String valorCreditoInput) {
	    if (isValorCreditoValid(valorCreditoInput)) {
	        this.valorCredito = Double.parseDouble(valorCreditoInput);
	    } else {
	        System.out.println("Digite um valor válido!");
	    }
	}

	public boolean isValorCreditoValid(String valorCreditoInput)
	{
		return Validations.isNumeroDecimalValido(valorCreditoInput);
	}
	
	public Double getValorCredito()
	{
		return valorCredito;
	}
	
	public void setValorDivida(String valorDividaInput) {
	    if (isValorDividaValid(valorDividaInput)) {
	        this.valorDivida = Double.parseDouble(valorDividaInput);
	    } else {
	        System.out.println("Digite um valor válido!");
	    }
	}
	
	public boolean isValorDividaValid(String valorDividaInput)
	{
		return Validations.isNumeroDecimalValido(valorDividaInput);
	}

	
	public Double getValorDivida()
	{
		return valorDivida;
	}
	
	public Double obterSaldo()
	{
		return valorCredito - valorDivida;
	}
	
	@Override
	
	public String toString()
	{
		return super.toString() +
			   "\nSaldo: " + obterSaldo();			
	}
	
	
}	
