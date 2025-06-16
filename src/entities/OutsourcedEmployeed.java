package entities;



public class OutsourcedEmployeed extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmployeed() {
		super();
		
	}

	public OutsourcedEmployeed(String name, Integer hours, Double valuePerHour, Double additionalChargeDouble) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalChargeDouble;
	}

	public Double getAdditionalChargeDouble() {
		return additionalCharge;
	}

	public void setAdditionalChargeDouble(Double additionalChargeDouble) {
		this.additionalCharge = additionalChargeDouble;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	

}
