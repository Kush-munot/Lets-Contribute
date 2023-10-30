#include<iostream>
using namespace std;
//fibonacci series
int main()
{
    int n;
    cin>>n;

    int a= 0;
    int b = 1;

    for (int i = 0; i <= n; i++)
    {
        int fib = a + b;
        cout<<fib<<" ";

        a = b;
        b = fib;
    }
    
    

    return 0;
}