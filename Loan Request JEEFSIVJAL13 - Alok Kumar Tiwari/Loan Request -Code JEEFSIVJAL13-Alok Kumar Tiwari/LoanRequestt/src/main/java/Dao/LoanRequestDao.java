package Dao;
import java.util.Map;

import Util.Collection;
import bean.LoanRequestAccounts;

public class LoanRequestDao implements ULoanRequestDao  {
	Collection collection = new Collection();

	@Override
	public LoanRequestAccounts getLoanRequestAccounts( String account_id) {
		Map<String,LoanRequestAccounts> map = collection.details();
		LoanRequestAccounts loanrequestaccount = map.get(account_id);
		return  loanrequestaccount;
		
	}
	
}
