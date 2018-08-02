#include "Student.h"
#include<string>
#include<iostream>
using namespace std;

Student::Student(string name,int roll_no,int age)
{
     cout<<"output:"<<endl;
    cout<<"name:"<< name << endl;
     cout<<"roll no:"<< roll_no << endl;
     cout<<"age:"<< age << endl;
}

Student::~Student()
{
     cout<< "staff object destroyed" <<endl;
}
