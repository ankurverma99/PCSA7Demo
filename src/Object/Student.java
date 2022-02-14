package Object;

public class Student {
String name;
String std;
int roll;
Student()
{}

Student(String name,String std,int roll)
{
this.name=name;
this.roll=roll;
this.std=std;
}

public String toString()
{
return "[Name : "+name+" Std :"+std+ " Roll : "+roll+"]";
}


}

