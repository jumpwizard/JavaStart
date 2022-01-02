package com.hspedu.map_;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.*;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class MapExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("001", new Employee("zhy", 50000, "001"));
        map.put("002", new Employee("wyt", 10000, "002"));
        map.put("003", new Employee("yc", 18000, "003"));
        Set set = map.keySet();
        for (Object o : set) {
            Employee employee = (Employee) map.get(o);
            if (employee.getSal() >= 18000) {
                System.out.println(employee);
            }
        }
        System.out.println("-------------");
        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            if (employee.getSal() >= 18000) {
                System.out.println(employee);
            }
        }
        System.out.println("----------------");
        Set set1 = map.entrySet();
        for (Object o : set1) {
            Map.Entry m = (Map.Entry) o;
            Employee employee = (Employee) m.getValue();
            if (employee.getSal() >= 18000) {
                System.out.println(employee);
            }
        }
    }
}
class Employee {
    private String name;
    private double sal;
    private String id;

    public Employee(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}