package Entities;

import java.util.Date;

public class Pessoa {
	private String Nome;
	private String Endereco;
	private String Telefone;
	private String Cargo = "Pessoa";
	private String Sexo;
	private Date DataNascimento;
	
	
	public Pessoa(String Nome, String Endereco, String Telefone, 
			String Cargo, String Sexo, Date DataNascimento)
	{
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Telefone = Telefone;
		this.Cargo = Cargo;
		this.Sexo = Sexo;
		this.DataNascimento = DataNascimento;
	}
	
	
	public Pessoa(String Nome, String Endereco, String Sexo, Date DataNascimento)
	{
		setNome(Nome);
		this.Endereco = Endereco;
		this.Sexo = Sexo;
		this.DataNascimento = DataNascimento;
	}
	
	public void setNome(String Nome)
	{
		if(isValidNome(Nome))
			this.Nome = Nome;
		else
			System.out.println("Digite um nome válido!");
	}
	
	public boolean isValidNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && nome.matches("[a-zA-Z ]+");
    }
	
	public String getNome()
	{
		return Nome;
	}
	
	public void setEndereco(String Endereco)
	{
		this.Endereco = Endereco;
	}
	
	public String getEndereco()
	{
		return Endereco;
	}
	
	public void setTelefone(String Telefone)
	{
		if(isValidTelefone(Telefone))
			this.Telefone = Telefone;
		else
			System.out.println("Digite um telefone válido!");
	}
	
	public boolean isValidTelefone(String telefone) {
        return telefone != null && telefone.matches("\\(\\d{2}\\) \\d{5}-\\d{4}");
    }
	
	public String telefoneFormatado(String Telefone)
	{
		return "(" + Telefone.substring(0, 2) + ")" +
				Telefone.substring(2, 7) + "-" + Telefone.substring(7, 11) ;
	}
	
	public String getTelefone()
	{
		return Telefone;
	}
	
	public void setCargo(String Cargo)
	{
		this.Cargo = Cargo;
	}
	
	public String getCargo()
	{
		return Cargo;
	}
	
	
	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		if(isValidGenero(sexo))
			this.Sexo = sexo;
		else
			System.out.println("Escolha um sexo valido!");
	}

	public boolean isValidGenero(String genero) {
        return genero != null && (genero.equalsIgnoreCase("Masculino") ||
                genero.equalsIgnoreCase("Feminino") || genero.equalsIgnoreCase("Outro"));
    }

	public Date getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) 
	{
		this.DataNascimento = dataNascimento;
	}
	
	@Override
	
	public String toString()
	{
		return  "Cargo: " + getCargo() +
				"\nNome: " + getNome() +
				"\nData de nascimento: " + getDataNascimento() +
			    "\nEndereco: " + getEndereco() +
			    "\nTelefone: " + getTelefone() +
			    "\nSexo: " + getSexo();
	}
}
