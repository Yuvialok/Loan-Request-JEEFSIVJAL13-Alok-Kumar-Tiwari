package Service;

public interface Validationn {

	
	 String accountIdPattern="[1-9][0-9]{11}";
	 String  amountpattern="[1-9]{4,8}";
	 String Tenurepattern="[12*1-12*20]{1,3}";
	 String CreditScorepattern="[1-9][0-9]{2}";
	 
	 public static boolean validatedata(String data, String Pattern)
	 {
		 return data.matches(Pattern);
	 }
}
