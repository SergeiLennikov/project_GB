package ru.gb.family_Tree.model;

import java.io.Serializable;
import java.util.List;

public interface FamilyTreeOperations<T extends FamilyMember<T>> extends Serializable {
    void addMember(T member);
    T findPerson(String name);
    List<T> getMembers();
    void sortByName();
    void sortByBirthDate();
}
