import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


// Remember that the class name should be "Main" and should be "public".
public class CorrectSentence{
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);

		// Read the number of test casese.		
		int T = in.nextInt();
		while (T-- > 0) {
			// Read the numbers M and S.
            Set<String> hs=new HashSet<String>();
            hs.add("a");
            hs.add("b");
            hs.add("c");
            hs.add("d");
            hs.add("e");
            hs.add("f");
            hs.add("g");
            hs.add("h");
            hs.add("i");
            hs.add("j");
            hs.add("k");
            hs.add("l");
            hs.add("m");
            Set<String> sh=new HashSet<String>();
            sh.add("N");
            sh.add("O");
            sh.add("P");
            sh.add("Q");
            sh.add("R");
            sh.add("S");
            sh.add("T");
            sh.add("V");
            sh.add("W");
            sh.add("X");
            sh.add("Y");
            sh.add("Z");
 
            int k = in.nextInt();
            String arr;
            for(int i = 0;i<k;i++) {
               arr = in.nextLine();
               String[]s=arr.split("\\s+");
               boolean it=true;
               for (int j = 1; j < s.length; j++) {
                   char ch;
                   int s1=0;
                   int s2=0;
                   int s3=0;
                   for (int l = 0; l < s[i].length(); l++) {
                       ch=s[i].charAt(l);
                        if((ch>='a' && ch<='m') )s1++; 
                       else if((ch>='N' && ch<='Z') )s2++; 
                       else s3++;
                  
                   }
                   it=((s1==0 || s2==0) && s3==0 && it);
               }
               if(it==true) System.out.println("YES");
                else  System.out.println("NO");
            }
  		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String nextLine() {
            return null;
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
 