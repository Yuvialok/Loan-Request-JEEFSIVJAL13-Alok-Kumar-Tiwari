package Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Service.LoanRequestService;
import Dao.LoanRequestDao;


class TestOf {
	LoanRequestService loanrequestservice=new LoanRequestService();
	LoanRequestDao loanrequestdao=new LoanRequestDao();

	@Test
	public void verifyLoanRequestServiceTest()
	{
	
		
		assertEquals(5000,loanrequestservice.getLoanRequestAccounts("100100010000").getAmount());
		assertEquals(24,loanrequestservice.getLoanRequestAccounts("100100010000").getTenure());
		assertEquals(800,loanrequestservice.getLoanRequestAccounts("100100010000").getCredit_score());
		assertEquals(8.5,loanrequestservice.getLoanRequestAccounts("100100010000").getRoi());
	}
	
	@Test
	public void verifyLoanRequestDaoTest()
	{
		assertEquals(5020,loanrequestdao.getLoanRequestAccounts("100100010002").getAmount());
		assertEquals(36,loanrequestdao.getLoanRequestAccounts("100100010002").getTenure());
		assertEquals(100,loanrequestdao.getLoanRequestAccounts("100100010002").getCredit_score());
		assertEquals(5.5,loanrequestdao.getLoanRequestAccounts("100100010002").getRoi());
	}

}
