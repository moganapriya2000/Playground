#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  char s[50];
  int length=0;
  cin>>s;
  for(int i=0;s[i]!='\0';i++)
  {
   length++;
  }
  cout<<"The length of word "<<s<<" is "<<length;

}