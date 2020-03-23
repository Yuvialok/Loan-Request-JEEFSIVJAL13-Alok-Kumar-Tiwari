package bean;

public class LoanRequestAccounts {
	 private String account_id;
	  private double amount;
	  private int tenure;
	   private int credit_score;
	   private double roi;
	   private String loan_type;
	    private String loan_status;
	    public LoanRequestAccounts() {
		}
		public String getAccount_id() {
			return account_id;
		}
		public void setAccount_id(String account_id) {
			this.account_id = account_id;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public int getTenure() {
			return tenure;
		}
		public void setTenure(int tenure) {
			this.tenure = tenure;
		}
		public int getCredit_score() {
			return credit_score;
		}
		public void setCredit_score(int credit_score) {
			this.credit_score = credit_score;
		}
		public double getRoi() {
			return roi;
		}
		public void setRoi(double roi) {
			this.roi = roi;
		}
		public String getLoan_type() {
			return loan_type;
		}
		public void setLoan_type(String loan_type) {
			this.loan_type = loan_type;
		}
		public String getLoan_status() {
			return loan_status;
		}
		public void setLoan_status(String loan_status) {
			this.loan_status = loan_status;
		}
		public LoanRequestAccounts(String account_id, double amount, int tenure, int credit_score, double roi,
				String loan_type, String loan_status) {
			super();
			this.account_id = account_id;
			this.amount = amount;
			this.tenure = tenure;
			this.credit_score = credit_score;
			this.roi = roi;
			this.loan_type = loan_type;
			this.loan_status = loan_status;
		}
	    
}
