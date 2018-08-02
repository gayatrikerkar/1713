#ifndef STAFF_H
#define STAFF_H
#include<string>
using namespace std;


class staff
{
    public:
        staff();
         ~staff();
         staff(string firstname);
         staff(string firstname,string lastname);
         string getfirstname() { return this->firstname;}
         string getlastnsmae() { return this->lastname;}
         string getfullname();

    protected:
     string firstname;
     string lastname;
    private:
};

#endif // STAFF_H
