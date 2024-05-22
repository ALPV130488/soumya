package casestudy;

public class Account {
	
	private String accHolderName;
	
	private long accNo;
	
	private long contactNo;
	
	private String typeOfAcc;
	
	private float accBal;

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getTypeOfAcc() {
		return typeOfAcc;
	}

	public void setTypeOfAcc(String typeOfAcc) {
		this.typeOfAcc = typeOfAcc;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public Account() {
		
	}

	public Account(String accHolderName, long accNo, long contactNo, String typeOfAcc, float accBal) {
		super();
		this.accHolderName = accHolderName;
		this.accNo = accNo;
		this.contactNo = contactNo;
		this.typeOfAcc = typeOfAcc;
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "Account [accHolderName=" + accHolderName + ", accNo=" + accNo + ", contactNo=" + contactNo
				+ ", typeOfAcc=" + typeOfAcc + ", accBal=" + accBal + "]";
	}
	
	
	

}
