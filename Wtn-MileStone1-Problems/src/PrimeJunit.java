
public class PrimeJunit {
public String isprime(int n) {
	int c=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			c++;
		}
	}
	if(c==2) {
		return "prime";
	}
	else {
		return "notprime";
	}
}
}
