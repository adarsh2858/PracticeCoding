#include <iostream>
using namespace std;

int main() {
	// my code is here
	int t,n,i,max,index;
	cin>>t;
	while(t--){
	    int total=0,count=0;
	    cin>>n;
	    int p[n];
	    for(i=0;i<n;i++)
	        cin>>p[i];
	    while(count<p.size()){
	        max=p[0];
	        index=0;
	        for(i=1;i<p.size())
	            if(max<p[i]){
	                max=p[i];
	                index=i;
	            }
	        total+=max;
	        p[index]=0;
    	    for(i=0;i<n;i++)
    	       if(p[i]!=0)
    	           p[i]--;
    	    n--;
    	    count++;
	    }
	    cout<<total;
	    }	    
	}
	return 0;
}
