package Dao;

import bean.LoanRequestAccounts;

public interface ULoanRequestDao {
	LoanRequestAccounts getLoanRequestAccounts(String account_id);

}
