package gameDemo.entities;

import gameDemo.abstracts.Entity;

public class Gamer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private int dataOfBirth;
	private String nationalityId;

	public Gamer() {
	}

	public Gamer(int id, String firstName, String lastName, int dataOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataOfBirth = dataOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(int dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
 

}
