/*Simple implementation of the Euler Totient Function*/

public class EulerTotient {
    int n, counter;
    int[] storage; //Stores all integers less than n that are relatively prime
    int index;
    
    public EulerTotient(int n ) {
        this.n = n;
        counter = 0;
        index = 0;
        storage = new int[n-1];
        
        for(int i = 1; i < n; i++) {
            if(gcd(n,i) == 1) {
                storage[index++] = i;
                counter++;
            }
        }
    }
    //Access functions
    public int getTotient() {
        return counter;
    }
    public int[] getStorage() {
        return storage;
    }
    //Euclidean Algorithm
    private int gcd(int p, int q) {
        if(q == 0) return p;
        return gcd(q, p%q);
    }
    
    public static void main(String[] args) {
        //EulerTotient max = new EulerTotient(13423);
        //EulerTotient josh = new EulerTotient(33);
        //EulerTotient dana = new EulerTotient(126);
    }
}
