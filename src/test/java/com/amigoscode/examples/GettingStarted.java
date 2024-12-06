package com.anmolcode.examples;

import com.anmolcode.beans.Person;
import com.anmolcode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> people = MockData.getPeople();
        List<Person> youngPeople = new ArrayList<>();
        int limit = 10;
        int counter = 0;
        for(Person p : people) {
            if(p.getAge() <= 18) {
                youngPeople.add(p);
                counter++;
                if(counter == limit) {
                    break;
                }
            }
        }
        youngPeople.forEach(System.out::println);
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();
    }
}
