/*Problem

Bob's crush's name starts with a vowel. That's the reason Bob loves vowels too much. He calls a string "lovely string" if it contains either all the lowercase vowels or all the uppercase vowels or both, else he calls that string "ugly string". 

For more clarification, see the sample testcase explanation.

Input

First line contains T, the number of test cases.
Next T lines contain a single string S.

Output

For each test case, print "lovely string" or "ugly string"  (without quotes)  according to the definition of Bob.

Constraints

string contains only lowercase and uppercase Latin letters. 

1<=T<=100
1<=len(s)<=100000
Sample Input
3
omahgoTuRuLob
OmAhgotUrulobEI
aeKORONAoiBATCHu

Sample Output
ugly string
lovely string
lovely string
*/
#include<iostream>
#include<string>
#define ll long long int
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        string s;
        ll a[256]={'\0'};
        cin>>s;
        for(ll i=0;i<s.length();i++){
            a[s[i]]++;
        }
       if(((a[65]!=0)&&(a[69]!=0)&&(a[73]!=0)&&(a[79]!=0)&&(a[85]!=0))||((a[97]!=0)&&(a[101]!=0)&&(a[105]!=0)&&(a[111]!=0)&&(a[117]!=0))){
           cout<<"lovely string"<<endl;
       }else{
           cout<<"ugly string"<<endl;
       }
    }
}
