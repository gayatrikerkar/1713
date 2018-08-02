#ifndef STUDENT_H
#define STUDENT_H
#include<string>
using namespace std;

class Student
{
    public:
         Student();
         ~Student();
         Student(string name);
         Student(string name,int roll_no,int age);
         string getname() { return this->name;}
         int getroll_no() { return this->roll_no;}
         int getage() {return this->age;}
         string getfulldetail();

    protected:
     string name;
     int roll_no;
      int age;

    private:
};

#endif // STUDENT_H
