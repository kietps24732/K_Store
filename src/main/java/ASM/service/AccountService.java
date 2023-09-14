package ASM.service;

import ASM.entity.Account;

public interface AccountService {
	Account findById(String username);
}
