package application.business;

import java.util.List;

import application.beans.Person;

public interface IProfilManager {
	
	/**
	 * This method adds a new person.
	 * it's a function which allows a new user signing up
	 * @param p
	 * @return person
	 */
	public Person addPerson(Person p);
	
	/**
	 * this method allows show a profil of user's.
	 * @param p
	 * @return person
	 */
	public Person showPerson(Person p);
	
	/**
	 * this method allows to make update a profil of a person
	 * @param idPerson
	 * @return person
	 */
	public Person updatePerson(int idPerson);
	
	/**
	 * this method remove the user.
	 * @param p
	 */
	public void deleteProfil(Person p);
	
	/**
	 * this method return the list of person whose the name passed to parameter
	 * @param name
	 * @return the list of person
	 */
	public List<Person> findPersonByName(String name);
	
	/**
	 * this method allows a user's to login in app.
	 * @param mail
	 * @param password
	 * @return person
	 */
	public Person loginPerson(String mail, String password);
	
}
