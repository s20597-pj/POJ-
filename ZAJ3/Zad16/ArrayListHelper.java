package Zad16;

import Zad11.Employee;
import Zad14.Date;

public class ArrayListHelper {
        public Employee Employee;
        public Date JoiningDate;

        public ArrayListHelper(String firstName, String lastName, int salary, Date joiningDate) {
            Employee = new Employee(321, firstName, lastName, salary);
            JoiningDate = joiningDate;
        }

    }
