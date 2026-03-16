package kattis;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Carrots {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));

        while (!in.ready()) {
            var line = in.readLine().trim().split(" ");
            var input = Integer.valueOf(line[0]);
            for(int i=0 ; i < input; i++) {
                in.readLine();
            }
            System.out.println(line[1]);
        }
    }
}