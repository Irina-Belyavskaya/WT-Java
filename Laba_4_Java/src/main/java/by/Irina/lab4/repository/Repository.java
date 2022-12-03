package by.Irina.lab4.repository;

import java.util.List;

import by.Irina.lab4.entity.Entity;
import by.Irina.lab4.exception.RepositoryException;
import by.Irina.lab4.specification.Specification;

public interface Repository<T extends Entity> {

    boolean add(T entity) throws RepositoryException;

    boolean remove(T entity) throws RepositoryException;

    boolean update(T entity) throws RepositoryException;

    List<T> query(Specification specification) throws RepositoryException;

}
