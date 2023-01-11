package HomeWorkL05;

public class testDemo {
    public static void main(String[] args) {
        System.out.println(job(3,4));
    }
    static int job(int n, int m)
    {
        int ans = 0, count = 0;
        while (m > 0)
        {
            if (m % 2 == 1)
                ans += n << count;
            count++;
            m /= 2;
        }
        return ans;


    }
}
