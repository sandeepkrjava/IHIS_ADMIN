package in.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.CwAccounts;
import in.ashokit.repo.CwAccountsRepository;


@Service
public class CwAccountCreateServiceImpl implements CwAccountCreateService {
	
	@Autowired
	private CwAccountsRepository repo;
	 


	@Override
	public String emailCheck(String email) {
		String findByEmail = repo.findByEmail(email);
		if(findByEmail==null)
			return ("email can be registered");
		else
			return ("email already exists");
		
	}


	@Override
	public String upsert(CwAccounts cwaccounts) {
		
		CwAccounts accounts = repo.save(cwaccounts);
		return "account is created";
	}



	

	
}
