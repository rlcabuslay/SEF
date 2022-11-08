package sef.module7.activity;

import java.util.Calendar;
import java.util.Date;

/**
 * Represents an implementation of the Currency interface.  The equality test for
 * this currency implementation requires that the value and the name of the denomination
 * must be true in order to be considered equal.
 * 
 * @author Ryan Vincent Cabuslay
 *
 */
public class CurrencyImpl implements Currency {
	
	protected float value;
	protected Denomination denomination;
	protected Calendar createDate;
	protected Date currentDate;

	/**
	 * Creates an instance of the of the Currency class with the specified
	 * value and denomination
	 * 
	 * @param value the value of the currency 
	 * @param denomination the denomination of the currency
	 */
	public CurrencyImpl(float value, Denomination denomination) {
		this.value = value;
		this.denomination = denomination;
		this.createDate = Calendar.getInstance();
		this.currentDate = this.createDate.getTime();
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Currency#getValue()
	 */
	public float getValue() {
		return this.value;
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Currency#getDenomination()
	 */
	public Denomination getDenomination() {
	    DenominationImpl d = new DenominationImpl();
	    d = (DenominationImpl)this.denomination;
		return d;
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Currency#getCreateDate()
	 */
	public Calendar getCreateDate() {
		this.createDate.setTime(currentDate);
		return (Calendar)this.createDate.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.toString();
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		if(o instanceof Currency) {
			Currency object = (Currency) o;
			
			return (this.getValue() == object.getValue()) && (this.getDenomination().getName().equals(object.getDenomination().getName()));
			
		} else {
			return false;
			
		}
	}

}
