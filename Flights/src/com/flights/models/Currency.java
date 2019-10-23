package com.flights.models;

public class Currency {
	public String code;
	public char symbol;
	public int decimalDigits;
	public boolean spaceBetweenAmountAndSymbol;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	public int getDecimalDigits() {
		return decimalDigits;
	}
	public void setDecimalDigits(int decimalDigits) {
		this.decimalDigits = decimalDigits;
	}
	public boolean isSpaceBetweenAmountAndSymbol() {
		return spaceBetweenAmountAndSymbol;
	}
	public void setSpaceBetweenAmountAndSymbol(boolean spaceBetweenAmountAndSymbol) {
		this.spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
	}
	
	
	
}
