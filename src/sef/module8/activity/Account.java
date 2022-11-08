package sef.module8.activity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Thsi class represents a simple representation of an account encapsulating
 * a name 
 * 
 * @author Ryan Vincent Cabuslay
 *
 */
public class Account {

	private String accountName;

	/**
	 * Creates an Account object with the specified name.  If the accout name
	 * given violates the minimum requirements, then an AccountException is thrown
	 * 
	 * @param accountName
	 * @throws AccountException
	 */
	public  Account(String accountName) throws AccountException{
			if(accountName.length() <= 4) {
				throw new AccountException(AccountException.NAME_TOO_SHORT, accountName);
			}
			
			boolean hasDigit = false;
			boolean hasLetter = false;
			
			for(char c: accountName.toCharArray()) {
				if(Character.isDigit(c)) {
					hasDigit = true;
				}
				if(Character.isAlphabetic(c)) {
					hasLetter = true;
				}
			}
			
			if(!hasDigit || !hasLetter) {
				throw new AccountException(AccountException.NAME_TOO_SIMPLE, accountName);
			}
			
			this.accountName = accountName;
	}
	
	
	/**
	 * Returns the account name
	 * 
	 * @return the account name
	 */
	public String getName(){
		return this.accountName;
	}
}
