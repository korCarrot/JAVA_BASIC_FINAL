package com.spring.account;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/*
 * 개별 메서드 또는 클래스의 트랜잭션 특성을 설명합니다.
이 주석이 클래스 수준에서 선언되면 선언 클래스 및 해당 하위 클래스의 모든 메서드에 기본값으로 적용됩니다. 
클래스 계층 구조의 상위 클래스에는 적용되지 않습니다. 하위 클래스 수준 주석에 참여하려면 상속된 메서드를 로컬에서 다시 선언해야 합니다.
 */

@Transactional(propagation = Propagation.REQUIRED)
public class AccountService {
	
	private AccountDAO accountDAO;

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public void sendMoney() throws Exception{
		System.out.println("여기는 서비스");
		accountDAO.updateBalance1();
		accountDAO.updateBalance2();
	}
}
