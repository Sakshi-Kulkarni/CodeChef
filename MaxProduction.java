import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 import java.util.StringTokenizer;

class  MaxProduction {
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
            int d = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z= in.nextInt();

            int ans=x*7;
            int ans2= (y*d)+(z*(7-d));
            System.out.println(Math.max(ans,ans2));
        }
	}
}
 

 