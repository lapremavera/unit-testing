package com.realdolmen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;
    @InjectMocks
    PersonService personService = new PersonService();
    Person p = new Person("Jimi", "Hendrix", null,null);


    @Test
    public void testpersonCanBeSafed() throws Exception {
        personService.safe(p);
        verify(personRepository).save(p);

    }
    @Test
    public void personCanBeFind(){
        when(personRepository.find(anyInt())).thenReturn(p);
        personService.findById(anyInt());
        verify(personRepository).find(anyInt());
    }
    @Test
    public void PersonCanBeRemoved(){
        when(personRepository.find(10)).thenReturn(p);
        personService.remove(10);
        verify(personRepository).find(eq(10));
        verify(personRepository).remove(same(p));

    }
}
