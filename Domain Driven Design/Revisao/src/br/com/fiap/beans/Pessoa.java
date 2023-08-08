package br.com.fiap.beans;

public abstract class Pessoa {
	
	private String name;
	private int age;
	protected double renda;
	private String email;

	public Pessoa() {
		super();
	}

	public Pessoa(String name, int age, double renda, String email) {
		super();
		this.name = name;
		this.age = age;
		this.renda = renda;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String identificador(); 
		
	public abstract double pagarTaxa();
}
