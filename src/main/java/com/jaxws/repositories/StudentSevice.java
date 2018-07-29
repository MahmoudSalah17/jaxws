package com.jaxws.repositories;

import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.ArrayList;

@WebService
public class StudentSevice {

    private Repo repo = new Repo();

    @WebMethod
    public ArrayList<Student> getStudents()
    {
        try{
            return repo.getAllStudents();
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @WebMethod
    public Student getStudent(String id)
    {
        try{
            return repo.getStudent(id);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @WebMethod
    public Student addStudent(String newId, String newName)
    {
        try {
            return repo.addStudent(new Student(newId, newName));
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @WebMethod
    public Student deleteStudent(String id)
    {
        try {
            return repo.deleteStudent(id);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @WebMethod
    public Student updateStudent(String newId, String newName)
    {
        try {
            return repo.updateStudent(new Student(newId, newName));
        }
        catch (Exception e)
        {
            return null;
        }
    }

}
