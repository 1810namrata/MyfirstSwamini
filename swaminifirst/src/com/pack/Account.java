package com.pack;

public class Account {
	
String acname;
int acno;


public Account(String acname, int acno) {
	super();
	this.acname = acname;
	this.acno = acno;
}
public String getAcname() {
	return acname;
}
public void setAcname(String acname) {
	this.acname = acname;
}
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
@Override
public String toString() {
	return "Account [acname=" + acname + ", acno=" + acno + "]";
}

}
