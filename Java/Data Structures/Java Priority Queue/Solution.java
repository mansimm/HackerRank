import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
/*
 * Create the Student and Priorities classes here.
 */
 class Student
 {
     int id;
     String name;
     double cgpa;
     
     public Student(int id, String name, double cgpa)
     {
         this.id = id;
         this.name = name;
         this.cgpa = cgpa;
     }
     public int getID() 
     {
         return id;
     }
     public String getName()
     {
         return name;
     }
     public double getCGPA()
     {
         return cgpa;
     }
     public String toString()
     {
         return cgpa+" "+name+"  "+id;
     }
 }
 class StudentComparator implements Comparator<Student>
 {
     public int compare(Student s1,Student s2)
     {
         if(s1.getCGPA()==s2.getCGPA())
         {
             if(s1.getName().equals(s2.getName()))
             {
                 return ((Integer)s1.getID()).compareTo((Integer)s2.getID());
             }
             else
             {
                 return s1.getName().compareTo(s2.getName());
             }
         }
         else
         {
            return ((Double)s2.getCGPA()).compareTo((Double)s1.getCGPA());
         }
     }
 }

class Priorities
{
    public List<Student> getStudents(List<String> events) 
    {
        PriorityQueue<Student> que = new PriorityQueue(new StudentComparator());
        for(String s : events)
        {
            if(s.equals("SERVED"))
            {
                que.poll();
            }
            else
            {
                String arr[] = s.split(" ");
                Student student = new Student(Integer.parseInt(arr[3]),
                arr[1],
                Double.parseDouble(arr[2]));
                que.add(student);   
                //System.out.println(student);          
            }
        }
        List<Student> ans = new ArrayList();
        Student  y = que.poll();
        
        if(y==null)
        {
            return ans;
        }
        else
        {
            ans.add(y);
            while(!que.isEmpty())
            {
                y = que.poll();
                ans.add(y);
            }
        }
        return ans;
    }
}
