package ASM.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ASM.entity.Account;

public interface AccountDAO extends JpaRepository<Account, String>{
	
}