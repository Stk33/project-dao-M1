package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date dataNasc;
	private Double salario;
	
	private Department departamento;
	
	public Seller(){
	}

	public Seller(Integer id, String name, String email, Date dataNasc, Double salario, Department departamento) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dataNasc = dataNasc;
		this.salario = salario;
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", dataNasc=" + dataNasc + ", salario="
				+ salario + ", departamento=" + departamento + "]";
	}
	
	
	
}
