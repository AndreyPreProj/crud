package ru.zaikin.crud.service;

import ru.zaikin.crud.model.Person;

import java.util.List;

public interface PeopleService {
    List<Person> getAll();
    void save(Person person);
    Person getById(int id);

    void update(Person person);
    void delete(int id);
}
