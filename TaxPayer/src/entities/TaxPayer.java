package entities;

public abstract class TaxPayer {

	private String name;
	private Double anualIncome;
	
	
	public TaxPayer() {		
	}

	public TaxPayer(String name, Double anulIncome) {
		this.name = name;
		this.anualIncome = anulIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();
		
}


