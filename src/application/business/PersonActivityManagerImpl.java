package application.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import application.beans.Activity;
import application.beans.Person;

@Stateless
public class PersonActivityManagerImpl implements IPersonActivityManager {

	 @PersistenceContext(unitName = "app-cv")
	 EntityManager em;
	 
	@PostConstruct()
	public void debut() {
		System.out.println("Starting " + this);
	}

	@PreDestroy
	public void fin() {
		System.out.println("Stopping " + this);
	}
		
	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		if(em.find(Person.class, p.getIdPerson())==null){
			em.persist(p);
		}else{
			em.merge(p);
		}
		
	}

	@Override
	public Person showPerson(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity showActivity(Activity activity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Activity> listActivityByPerson(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Activity> findActivityByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findPersonByActivity(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
