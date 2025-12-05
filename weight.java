import java.util.Arrays;

class Items {
    int w;
    int p;
    double ratio;

    public Items(int w, int p) {
        this.w = w;
        this.p = p;
        this.ratio = (double) p / w;
    }
}

public class weight {
    public static void main(String[] args) {

        Items[] item = {
            new Items(10, 20),
            new Items(20, 100),
            new Items(30, 120)
        };

        int capacity = 50;
        double profit = 0.0;

        // Sort items by ratio descending
        Arrays.sort(item, (a, b) -> Double.compare(b.ratio, a.ratio));

        System.out.println("Items sorted by ratio (profit/weight):");
        for (Items it : item) {
            System.out.println("W=" + it.w + ", P=" + it.p + ", ratio=" + it.ratio);
        }

        // Fractional knapsack greedy
        for (Items it : item) {
            if (capacity == 0) break;

            if (it.w <= capacity) {
                // take whole item
                profit += it.p;
                capacity -= it.w;
            } else {
                // take fractional part
                profit += it.ratio * capacity;
                capacity = 0;
            }
        }

        System.out.println("Maximum Profit = " + profit);
    }
}
