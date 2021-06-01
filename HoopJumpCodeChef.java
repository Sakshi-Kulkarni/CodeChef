 /* package codechef; // don't place package name! */

import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class HoopJumpCodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);

		// Read the number of test casese.		
		int T = in.nextInt();
		while (T-- > 0) {
			int N = in.nextInt();
            System.out.println(N/2+1);
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
