#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50],s2[50];
  cin>>s1>>s2;
  int result=strcmp(s1,s2);
  if(result==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}