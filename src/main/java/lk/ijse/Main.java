package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import lk.ijse.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();

      /*  FullName fullName=new FullName("Nethma","Sasindi");
        Student student=new Student();
        student.setId(1);
        student.setName(fullName);
        student.setAddress("Galle");*/

      /*  FullName fullName=new FullName("Dilsha","Perera");
        Student student=new Student();
        student.setId(2);
        student.setName(fullName);
        student.setAddress("Galle");*/
/*
        FullName fullName=new FullName("Akila","Ishani");
        Student student=new Student();
        student.setId(3);
        student.setName(fullName);
        student.setAddress("Matara");*/

        Teacher teacher=new Teacher();
        teacher.setId(2);
        teacher.setName("Sugandi");
        teacher.setSalary(40000);

        //open transaction
        Transaction transaction=session.beginTransaction();
          // session.save(teacher);
       //session.save(student);
       // session.update(student);
       //session.delete(student);

        session.save(teacher);

       // Student student1=(Student) session.get(Student.class, "2");

        transaction.commit();
       // System.out.println(student1);
        session.close();

    }
}