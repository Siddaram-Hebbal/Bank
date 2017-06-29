package com.adem;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.adem.dao.AccountRepository;
import com.adem.dao.CustomerRepository;
import com.adem.dao.OperationRepository;
import com.adem.entities.Account;
import com.adem.entities.CurrentAccount;
import com.adem.entities.Customer;
import com.adem.entities.Operation;
import com.adem.entities.PaymentOperation;
import com.adem.entities.SavingsAccount;
import com.adem.entities.WithdrawalOperation;
import com.adem.service.IBankService;

@SpringBootApplication
public class BankApplication {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private OperationRepository operationRepository;
	
	@Autowired
	private IBankService iBankService;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BankApplication.class, args);

	}

/*	@Override
	public void run(String... arg0) throws Exception {
		
		
		
		
		
		
		/*
		Customer cust1 = customerRepository.save(new Customer("adem",
				"adem@gmail.com"));
		Customer cust2 = customerRepository.save(new Customer("asma",
				"asma@gmail.com"));

		Account acc1 = accountRepository.save(new CurrentAccount("acc1",
				new Date(), 9000, cust1, 6000));
		Account acc2 = accountRepository.save(new SavingsAccount("acc2",
				new Date(), 6000, cust2, 5.5));
		
		Operation paymentOpAcc1 = operationRepository.save(new PaymentOperation(new Date(), 2000, acc1));
		Operation widhdrawelOpAcc1 = operationRepository.save(new WithdrawalOperation(new Date(), 1000, acc1));
		Operation paymentOp1Acc1 = operationRepository.save(new PaymentOperation(new Date(), 2000, acc1));
		Operation widhdrawelOp1Acc1 = operationRepository.save(new WithdrawalOperation(new Date(), 1000, acc1));
		Operation paymentOp2Acc1 = operationRepository.save(new PaymentOperation(new Date(), 5000, acc1));
		Operation widhdrawelOp2Acc1 = operationRepository.save(new WithdrawalOperation(new Date(), 1000, acc1));
		Operation paymentOp3Acc1 = operationRepository.save(new PaymentOperation(new Date(), 8741, acc1));
		Operation widhdrawelOp3Acc1 = operationRepository.save(new WithdrawalOperation(new Date(), 2000, acc1));
		Operation paymentOp4Acc1 = operationRepository.save(new PaymentOperation(new Date(), 6587, acc1));
		Operation widhdrawelOp4Acc1 = operationRepository.save(new WithdrawalOperation(new Date(), 2547, acc1));
		
		Operation paymentOpAcc2 = operationRepository.save(new PaymentOperation(new Date(), 1000, acc2));
		Operation widhdrawelOpAcc2 = operationRepository.save(new WithdrawalOperation(new Date(), 2000, acc2));

		iBankService.payToAccount(acc1.getAccountId(), 99999999); */
}