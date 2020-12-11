package ru.itsjava.jdbc.dao;

import ru.itsjava.jdbc.domain.Employer;

public interface EmployerDao {
    Employer findByName(String name);
}
