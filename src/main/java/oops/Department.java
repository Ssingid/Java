package oops;

import java.util.Scanner;

public class Department {
    public static void main(String[] args){
        SubDepartmnt SD=new SubDepartmnt();
        System.out.println(SD.getDepartmentSize());
    }

}

abstract class Departmnt{
    abstract public int getDepartmentSize();
}

class SubDepartmnt extends Departmnt{
    public int getDepartmentSize(){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        return x;
    }

}


