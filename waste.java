// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 import java.util.StringTokenizer;

class waste {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args)
	{
		FastReader in= new FastReader();
        int T = in.nextInt();
        while (T-- > 0) {
            long D = in.nextLong();
            long d = in.nextLong();
            long P = in.nextLong();
            long Q = in.nextLong();
            long n = D / d;
             long z=1,c=2;
            long rem=D%d;
            System.out.println(D*P+(Q*d*n*(n-z))/c+Q*n*rem);
        }
	}
}
/*
import java.util.*;
 class waste{
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int T = in.nextInt();
         while (T-- > 0) {
             long D = in.nextLong();
             long d = in.nextLong();
             long P = in.nextLong();
             long Q = in.nextLong();
             long n = D / d;
              long z=1,c=2;
             long rem=D%d;
             System.out.println(D*P+(Q*d*n*(n-z))/c+Q*n*rem);
         }
     }
 }*/