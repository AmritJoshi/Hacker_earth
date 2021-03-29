/*Problem

Max has a string S with length N. He needs to find the number of indices i (1≤i≤N−11≤i≤N−1) such that the i-th character of this string is a consonant and the i+1th character is a vowel. However,she is busy, so she asks for your help.

Note: The letters 'a', 'e', 'i', 'o', 'u' are vowels; all other lowercase English letters are consonants.

Input

    The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
    The first line of each test case contains a single integer N.
    The second line contains a single string S with length N.

Output

For each test case, print a single line containing one integer ― the number of occurrences of a vowel immediately after a consonant

Constraints

    1≤T≤1001≤T≤100
    1≤N≤1001≤N≤100
    SS contains only lowercase English letters

Sample Input

3
6
bazeci
3
abu
1
o
Sample Output
3
1
0
*/
#include<iostream>
using namespace std;
#define ll long long int
int main()
{
ll t;
cin>>t;
ll n;
int count=0;
while(t--){
   // cout<<"enter no of string";
    cin>>n;
    char a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<n;i++){
        if(((a[i]!='a')&&(a[i]!='e')&&(a[i]!='i')&&(a[i]!='o')&&(a[i]!='u'))&&((a[i+1]=='a')||(a[i+1]=='e')||(a[i+1]=='i')||(a[i+1]=='o')||(a[i+1]=='u'))){
            count+=1;
        }
    }
    cout<<count<<endl;
    count=0;
}
}
