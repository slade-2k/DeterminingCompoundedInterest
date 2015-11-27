package model;

import java.text.NumberFormat;

public class Interest {
	private int principalAmount;
	private int years;
	private int compounded;
	private double rate;
	private double interest;
	
	public Interest(){
	}
	
	public String getInterest(){
		NumberFormat nFormat = NumberFormat.getInstance();
		nFormat.setMaximumFractionDigits(3);
		return nFormat.format(this.principalAmount * Math.pow(1+ this.rate/this.compounded, this.compounded*this.years));
	}
	
	public int getPrincipalAmount(){
		return this.principalAmount;
	}
	
	public void setPrincipalAmount(int amount){
		this.principalAmount = amount;
	}
	
	public int getYears(){
		return this.years;
	}
	
	public void setYears(int years){
		this.years = years;
	}
	
	public int getCompounded(){
		return this.compounded;
	}
	
	public void setCompounded(int compound){
		this.compounded = compound;
	}
	
	public double getRate(){
		return this.rate;
	}
	
	public void setRate(double rate){
		this.rate = rate/100;
	}	
}
