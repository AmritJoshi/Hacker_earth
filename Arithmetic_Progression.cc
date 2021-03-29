/*Problem

You will be given three numbers A,B,C .You can perform the following operation on these numbers any number of times.You can take any integer from A, B, C and you can add or substract 1 from it.

Each operation cost 1sec of time(say). Now you have to determine the minimum time required to change those numbers into an Arithmetic Progression. 

i.e B-A=C-B
Input :

First line of input contains T denoting number of test cases.

Next T lines contains space seperated integers A,B,C
Output :

For each test case, print a single line containing one integer — the minimum time require to change A,B,C into an arithmetic progression.
Constraints :
1<=t<=100000
-10^8<=A,B,C<=10^8

Sample Input:
5
-5 0 5
-5 7 6
-10 -100 20
1 -1 1
51 23 10
Sample Output:
0
7
105
2
8
*/
#include<iostream>
using namespace std;
#define ll long long int
int main(){
	ll t;
	cin>>t;
	ll a,b,c;
	while(t--){
	cin>>a>>b>>c;
	cout<<(abs((b-a)-(c-b))+1)/2<<endl;
	}
}
