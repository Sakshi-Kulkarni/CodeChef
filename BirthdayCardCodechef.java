/* package codechef; // don't place package name! */

import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class BirthdayCardCodechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        // Read the number of test casese.
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int K = in.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            if (N == 1 && K != 0) {
                System.out.println(arr[0]);
            } else {
                Arrays.sort(arr);
                int i = arr.length - 1;
                long c = 0;
                long b = 0;
                int k = K;
                while (K-- > 0) {
                    c = c + arr[i];
                    i = i - 2;
                }
                i = N - 2;
                k = K;
                while (k-- > 0) {
                    b = b + arr[i];
                    i = i - 2;
                }
                b = b + arr[i + 1];
                if (K == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(Math.max(c, b));
                }
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
