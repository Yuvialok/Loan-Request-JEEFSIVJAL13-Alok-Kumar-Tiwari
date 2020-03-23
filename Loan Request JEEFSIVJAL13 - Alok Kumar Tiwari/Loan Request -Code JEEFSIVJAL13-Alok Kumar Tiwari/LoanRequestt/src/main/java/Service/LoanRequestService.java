package Service;

import Dao.LoanRequestDao;
import bean.LoanRequestAccounts;

public class LoanRequestService implements ULoanRequestService {
	LoanRequestDao dao=new LoanRequestDao();
	@Override
	public LoanRequestAccounts getLoanRequestAccounts(String account_id) 
	{
		return dao.getLoanRequestAccounts(account_id);
	}

}
