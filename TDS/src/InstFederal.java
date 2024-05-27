
public class InstFederal {
	
	private String campus;
	private String endereco;
	private Departamento departamento;
	
	public InstFederal() {
		this.campus = "";
		this.endereco = "";
		this.departamento = new Departamento();
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
