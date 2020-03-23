package Util;

import java.util.HashMap;
import java.util.Map;

import bean.LoanRequestAccounts;

public class Collection {
	public static Map<String,LoanRequestAccounts > map=new HashMap<String, LoanRequestAccounts >();
	static {
		map.put("100100010000", new LoanRequestAccounts("100100010000",5000,24,800,8.5,"personal loan","On Progress"));
		map.put("100100010001", new LoanRequestAccounts("100100010001",5010,24,900,7.5,"Home loan","On Progress"));
		map.put("100100010002", new LoanRequestAccounts("100100010002",5020,36,100,5.5,"education loan","pending"));
		map.put("100100010003", new LoanRequestAccounts("100100010003",5030,24,990,9.5,"business loan","On Progress"));
		map.put("100100010004", new LoanRequestAccounts("100100010004",5040,24,12,8.5,"personal loan","pending"));
		map.put("100100010005", new LoanRequestAccounts("100100010005",5050,38,700,2.5,"Vehicle loan","ON Progress"));
		map.put("100100010006", new LoanRequestAccounts("100100010006",5060,24,140,4.5,"Shop lone","pending"));
		map.put("100100010007", new LoanRequestAccounts("100100010007",5070,60,803,3.5,"personal loan","On Progress"));
		map.put("100100010008", new LoanRequestAccounts("100100010008",5080,24,16,7.5,"Home loan","pending"));
		map.put("100100010009", new LoanRequestAccounts("100100010009",5090,120,870,1.5,"Agriculture loan","On Progress"));
	}
	public static Map<String, LoanRequestAccounts> details()
	{
		return map;
	}

}
