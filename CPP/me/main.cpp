#include <iostream>

using namespace std;

int main()
{
    cout << "Bubble sort!" << endl;
    int data[]= {3,22,15,5,27,16,1,17,30,22};
     int datasize = (sizeof(data)/sizeof(*data));
     cout << "input";
     for(int i = 0; i < datasize; i++)
     {
        cout << "..."<<data[i];
         for(int j = 0; j < i; j++)
         {
            if(data[i] < data[j])
            {
            data[i] += data[j];
            data[j] = data[i]-data[j];
            data[i] = data[i]-data[j];
            }
         }
     }
     cout << endl << "output";
     for(int i = 0; i < datasize; i++)
     {
         cout <<"...." << data[i];
     }
     cout << endl;
    return 0;
}
