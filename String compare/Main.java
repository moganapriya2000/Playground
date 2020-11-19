#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s1[100];
char s2[100];
cin>>s1>>s2;
 int result= strcmp(s1,s2);
  if(result!=0)
    cout<<"Strings are not same";
  else
    cout<<"Strings are same";
}