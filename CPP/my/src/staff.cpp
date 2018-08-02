#include "staff.h"
#include<string>
#include<iostream>
using namespace std;

staff::staff(string fname,string lname)
{
    cout<<"output:"<<endl;
    cout<<"first name:"<< fname << endl;
     cout<<"last name:"<< lname << endl;
}

staff::~staff()
{
    cout<< "staff object destroyed" <<endl;
}
