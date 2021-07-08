import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 import java.util.StringTokenizer;

class  RelativityCodeChef {
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
            int g = in.nextInt();
            int c = in.nextInt();
             

            int ans=c*c;
            int ans2=  2*g;
            System.out.println(ans/ans2);
        }
	}
}
 

 
 