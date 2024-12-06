package com.anmolcode.examples;

import com.anmolcode.beans.Car;
import com.anmolcode.beans.Person;
import com.anmolcode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Sorting {

    @Test
    public void sortingSteamOfElements() throws IOException {
        List<Person> people = MockData.getPeople();
    }

    @Test
    public void sortingSteamOfElementsReverse() throws IOException {
        List<Person> people = MockData.getPeople();
    }

    @Test
    public void sortingSteamOfObjets() throws IOException {
        List<Person> people = MockData.getPeople();
    }

    @Test
    public void topTenMostExpensiveBlueCars() throws IOException {
        List<Car> cars = MockData.getCars();
    }

}
