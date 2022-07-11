package telran.people;

public class SalesPerson extends Employee {
	private int sales;
	private int percent;
	public SalesPerson (long id, int birthYear, String email, int basicSalary, int sales, int percent) {
		super(id, birthYear, email, basicSalary);
		setSales(sales);
		setPercent(percent);
	}
	public void setSales(int sales) {
		this.sales = sales;		
	}
	public void setPercent(int percent) {
		this.percent = percent;		
	}
	public int computePay() {
		return getBasicSalary() + ((sales/100) * percent);
	}
	

}
