package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmloyees;
	
	public Company() {		
	}

	public Company(String name, Double anulIncome, Integer numberOfEmloyees) {
		super(name, anulIncome);
		this.numberOfEmloyees = numberOfEmloyees;
	}

	public Integer getNumberOfEmloyees() {
		return numberOfEmloyees;
	}

	public void setNumberOfEmloyees(Integer numberOfEmloyees) {
		this.numberOfEmloyees = numberOfEmloyees;
	}

	@Override
	public Double tax() {
		if( numberOfEmloyees > 10) {
			return getAnualIncome() * 0.14;
		}
		return getAnualIncome() * 0.16;
	}
	
	
}
