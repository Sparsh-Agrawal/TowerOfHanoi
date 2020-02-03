import java.util.Scanner;

public class TowerOfHanoi
{
    public static void solveTOH(int n, String source, String aux, String dest)
    {
        // If only 1 disk, make the move and return.
        if(n==1)
        {
            System.out.println(source+" --> "+dest);
            return;
        }

        // Move top n-1 disks from A to B using C as auxiliary.
        solveTOH(n-1, source, dest, aux);

        //Move remaining disks from A to C
        System.out.println(source+" --> "+dest);

        // Move n-1 disks from B to C using A as auxiliary
        solveTOH(n-1, aux, source, dest);

    }

    public static void main(String args[])
    {
        System.out.println("Enter number of disks :- ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Move disks as below illustration.");
        solveTOH(n, "A", "B", "C");

    }
}
