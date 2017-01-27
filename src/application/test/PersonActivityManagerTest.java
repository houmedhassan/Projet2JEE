package application.test;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import org.junit.Test;

import application.beans.Person;
import application.business.PersonActivityManagerImpl;

public class PersonActivityManagerTest {

	@EJB
	PersonActivityManagerImpl personActivityImpl;
	
	Person person = new Person();
	
	 public PersonActivityManagerTest() throws Exception {
	        EJBContainer.createEJBContainer().getContext().bind("inject", this);
	        
	  }
	
	 /**
	  * this method test if the person was save in database
	  */
	 @Test
	 public void savePersonTest(){
		 person.setIdPerson(1);
		 person.setLastName("HASSAN MOHAMED");
		 person.setFirstName("Houmed");
		 person.setMail("houmedhassan@outlook.com");
		 person.setWebSite("page.perso.univ-luminy");
		 person.setBirthDay(new Date(1991,10,31));
		 person.setPassWord("1234567890");
		 
		 personActivityImpl.addPerson(person);
	 }
	

}
