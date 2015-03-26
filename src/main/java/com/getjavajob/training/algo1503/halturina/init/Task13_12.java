package com.getjavajob.training.algo1503.halturina.init;

import java.util.Arrays;

/**
 * Created by floud on 21.03.2015.
 */
public class Task13_12 {

    public static Employee[] employees;

    public static class Searcher {
        public static String searchSubstringOfFullName(Employee[] employees, String string){
            StringBuilder sb = new StringBuilder();
            for (Employee e : employees) {
                if (e.getFirstName().toLowerCase().contains(string.toLowerCase()) || e.getLastName().toLowerCase().contains(string.toLowerCase()) ||
                        (e.getMiddleName() != null && e.getMiddleName().toLowerCase().contains(string.toLowerCase()))) {
                    sb.append(e.toString() + "\n");
                }

            }
            return sb.toString();
        }

        /**
         * Get employee, which is working more than n-years.*/
        public static String getEmployeesOldies(Employee[] employees, int n) {

            StringBuilder sb = new StringBuilder();
            for (Employee e : employees) {
                if (e.getYearsOfWork() >= n) {
                    sb.append(e.toString() +  "\n");
                }

            }
            return sb.toString();
        }
    }
    public static class Employee {

        @Override
        public String toString() {

            if (middleName != null) {
                return lastName + " " + firstName + " " + middleName + ", " + address ;
            } else {
                return lastName + " " + firstName + ", " + address ;
            }

        }

        public int getYearsOfWork() {
            int currentMonth = 3;
            int currentYear = 2015;
            String[] strings = getDateOfJoin().split(", ");
            int employeeMonth = Integer.parseInt(strings[0]);
            int employeeYear = Integer.parseInt(strings[1]);
            return (currentYear - employeeYear) + (currentMonth - employeeMonth)/12;
        }
        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getAddress() {
            return address;
        }

        public String getDateOfJoin() {
            return dateOfJoin;
        }
        private String lastName;
        private String firstName;
        private String middleName;
        private String address;
        private String dateOfJoin;

        public Employee(String lastName, String firstName, String address, String dateOfJoin) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.address = address;
            this.dateOfJoin = dateOfJoin;
        }

        public Employee(String lastName, String firstName, String middleName, String address, String dateOfJoin) {
            this(lastName, firstName, address, dateOfJoin);
            this.middleName = middleName;

        }
    }
}
