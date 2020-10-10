#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t,g,i,n,q;
	cin>>t;
	for(int cases=0;cases<t;cases++){
	    cin>>g;
	    for(int games=0;games<g;games++){
	        cin>>i>>n>>q;
	        int coin[n];
	       for(int k=1;k<=n;k++){
	           coin[k-1]=i;
	       }
	       int count=1;
           for(int j=1;j<=count;j++){
               if(coin[j-1]==1)
                    coin[j-1]=2;
               else
                    coin[j-1]=1;
                if(count==n)
                break;
                count++;
           }
	       int count_heads=0;
	       for(i=1;i<=n;i++){
	           if(coin[i-1]==1)
	           count_heads++;
	       }
	       int count_tails=n-count_heads;
	       if(q==1)
	            cout<<count_heads;
	       else
	            cout<<count_tails;
	        cout<<endl;
	    }
	}
	return 0;
}
