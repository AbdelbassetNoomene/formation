package com.majustic.formation.demo.dto;

public class MetricDTO {
	private int nbUsersWithoutAddress;
	private int nbUsersWithAddress;
	private int nbAddLeastOneUser;
	private int nbAddWithoutUser;
	public int getNbUsersWithoutAddress() {
		return nbUsersWithoutAddress;
	}
	public void setNbUsersWithoutAddress(int nbUsersWithoutAddress) {
		this.nbUsersWithoutAddress = nbUsersWithoutAddress;
	}
	public int getNbUsersWithAddress() {
		return nbUsersWithAddress;
	}
	public void setNbUsersWithAddress(int nbUsersWithAddress) {
		this.nbUsersWithAddress = nbUsersWithAddress;
	}
	public int getNbAddLeastOneUser() {
		return nbAddLeastOneUser;
	}
	public void setNbAddLeastOneUser(int nbAddLeastOneUser) {
		this.nbAddLeastOneUser = nbAddLeastOneUser;
	}
	public int getNbAddWithoutUser() {
		return nbAddWithoutUser;
	}
	public void setNbAddWithoutUser(int nbAddWithoutUser) {
		this.nbAddWithoutUser = nbAddWithoutUser;
	}
	

}
