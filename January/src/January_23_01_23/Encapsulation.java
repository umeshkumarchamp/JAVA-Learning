package January_23_01_23;

public class Encapsulation {
	
	private Integer id; 
	private Integer emp_id; 
	private String date_of_claim; 
	private Double total_amt; 
	private Boolean approved; 
	private Boolean paid;
	
	
	public Encapsulation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Encapsulation(Integer id, Integer emp_id, String date_of_claim, Double total_amt) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.date_of_claim = date_of_claim;
		this.total_amt = total_amt;
		this.approved = false;
		this.paid = false; 
	}


	public void setApproved(Boolean approved) {
		
		this.approved = approved;
	}
	
	public void setPaid(Boolean paid) {
		
		if(paid && !approved) {
			System.out.println("This item cannot be paid as it has not approved.");
		}
		else {
			this.paid = paid;
		}
		
	}
	
	
	
	
	
	
	
	

}
