package kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Peasoup {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        var result = "Anywhere is fine I guess";
        var restaurants = Long.valueOf(in.readLine().trim());
        var found = false;

        for (int i = 0; i < restaurants && !found; i++) {
            var dishes = Long.valueOf(in.readLine().trim());
            var name = in.readLine().trim();
            var hasPea = false;
            var hasPancakes = false;
            for (int j = 0; j < dishes; j++) {
                var dish = in.readLine().trim();
                if ("pea soup".equals(dish)) {
                    hasPea = true;
                }
                if ("pancakes".equals(dish)) {
                    hasPancakes = true;
                }
            }
            g
            if (hasPancakes && hasPea) {
                found = true;
                result = name;
            }

        }

        System.out.println(result);

    }
}