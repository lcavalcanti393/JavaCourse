package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double value = 0.0;
		
		if(numberOfEmployees > 10)
			value += getAnualIncome() * 0.14;
		else
			value += getAnualIncome() * 0.16;
		
		return value;
	}

}
