package com.getjavajob.training.algo05.halturina.init;
import static com.getjavajob.training.algo05.halturina.init.Task13_012.*;

/**
 * Created by floud on 21.03.2015.
 */
public class Task13_012Test {
    public static void main(String[] args) {
        Task13_012.Employee employee1 = new Task13_012.Employee("Иванов", "Иван", "Иванович", "Москва, ул. Черепушкина", "9, 2012");
        Task13_012.Employee employee2 = new Employee("Петров", "Сергей", "Федорович", "Череповец, б-р Кукуева, 5", "12, 2003");
        Task13_012.Employee employee3 = new Employee("Петухов", "Виктор", "Санкт Петербург, под мостом, 5", "6, 2011");
        Employee employee4 = new Employee("Кряков", "ИВаН", "Витальевич", "Москва, Кремль,", "7, 2000");
        Employee employee5 = new Employee("Сергеев", "Иван", "Михайлович", "Могилев, ул. Пионерская, 7", "7, 1984");
        employees = new Employee[]{employee1, employee2, employee3, employee4, employee5};

        System.out.println(Searcher.searchSubstringOfFullName(employees, "ИВАН"));
        System.out.println(Searcher.getEmployeesOldies(employees, 4));

    }
}
