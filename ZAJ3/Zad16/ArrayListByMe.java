package Zad16;

import Zad14.Date;

import java.util.ArrayList;

public class ArrayListByMe {

        public static void main(String[] args) {
            ArrayList<ArrayListHelper> arrList = new ArrayList<ArrayListHelper>();
            populate(arrList);
            for (ArrayListHelper elOfArr : arrList) {
                System.out.println("Name:"+elOfArr.Employee.getName()+" Salary:"+elOfArr.Employee.getSalary()+" date of joining:"+elOfArr.JoiningDate.toString());
            }
        }

        public static void populate(ArrayList<ArrayListHelper> arrList) {
            Date randomDate = new Date(12, 12, 2020);
            Date randomDate2 = new Date(11, 11, 2015);
            Date randomDate3 = new Date(9, 6, 2006);
            arrList.add(new ArrayListHelper("Some", "Guy1", 1000, randomDate));
            arrList.add(new ArrayListHelper("Some", "Guy2", 2000, randomDate));
            arrList.add(new ArrayListHelper("Some", "Guy3", 3000, randomDate));
            arrList.add(new ArrayListHelper("Some", "Guy4", 4000, randomDate2));
            arrList.add(new ArrayListHelper("Some", "Guy5", 5000, randomDate2));
            arrList.add(new ArrayListHelper("Some", "Guy6", 6000, randomDate2));
            arrList.add(new ArrayListHelper("Some", "Guy7", 7000, randomDate3));
            arrList.add(new ArrayListHelper("Some", "Guy8", 8000, randomDate3));
        }

    }
