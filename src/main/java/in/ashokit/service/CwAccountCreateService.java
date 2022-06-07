package in.ashokit.service;

import in.ashokit.entity.CwAccounts;

public interface CwAccountCreateService  {
	
	
	public String emailCheck(String email);
	
	public String upsert(CwAccounts cwaccounts);
	
	
	

}
