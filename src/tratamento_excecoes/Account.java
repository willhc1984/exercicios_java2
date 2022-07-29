package tratamento_excecoes;

import javax.management.RuntimeErrorException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void withdraw(double amount) {
		validateWithDraw(amount);
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	private void validateWithDraw(double amount) {
		if(amount > getWithDrawLimit()) {
			throw new BusinessException("Sem limite de saque!");
		}
		if(amount > getBalance()) {
			throw new BusinessException("Saldo insuficiente!");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [number=");
		builder.append(number);
		builder.append(", holder=");
		builder.append(holder);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", withDrawLimit=");
		builder.append(withDrawLimit);
		builder.append("]");
		return builder.toString();
	}
	

}
