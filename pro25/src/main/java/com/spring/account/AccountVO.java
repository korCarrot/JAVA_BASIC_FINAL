package com.spring.account;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountVO {
	
	private String accountNo;
	private String custName;
	private int balance;
	
	
	
}
