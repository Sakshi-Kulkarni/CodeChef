import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


// Remember that the class name should be "Main" and should be "public".
public class LazyChef{
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);

		// Read the number of test casese.		
		int T = in.nextInt();
		while (T-- > 0) {
			// Read the numbers M and S.
			int x = in.nextInt();
			int m = in.nextInt();
            int d=in.nextInt();
			
			 
			int ans =x*m;
            int f=x+d;
			System.out.println(Math.min(ans, f));
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
				    tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
				    throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
/*public class XorEquality {
	*#include <bits/stdc++.h>

using namespace std;


int main() {
   /* int t;

	cin>>t;
null n;
	while(t--)

	{
      cin>>n;
      null ans;
      if(n==1)count<<"1\n";
      else{
          n--;
          null a=2;
          null ans=1;
          while (n>0) {
                if(n&1)ans=ans*a%MODULO;
                a=a*a%MODULO;
                n>>=1;              
          }
          count<<ans<<"\n";
      }
    }
    return 0;

}*/
