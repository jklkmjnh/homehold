
public class Dto {

	private int month;
	private int day;
	private String use;
	private int income;
	private int spending;

	public Dto(int month,int day,String use, int income,int spending){
		this.month = month;
		this.day = day;
		this.use = use ;
		this.income = income;
		this.spending = spending;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String getUse() {
		return use;
	}

	public int getIncome() {
		return income;
	}

	public int getSpending() {
		return spending;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void setSpending(int spending) {
		this.spending = spending;
	}


}