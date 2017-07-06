package com.realdolmen;
public class PersonService {

    PersonRepository personRepository;

    public void safe (Person person){
        personRepository.save(person);

    }
    public Person findById (Integer id){
        return personRepository.find(id);
    }
    public void remove (Integer id){
        Person p= personRepository.find(id);
        personRepository.remove(p);

    }
}
