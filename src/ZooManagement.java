import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        // int nbrCages =20;
        // String zooName="my zoo";
        int nbrCages = 0;
        String zooName;
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.println("saisir le nom du zoo: ");
            zooName = myObj.nextLine().trim();
        } while (zooName.isEmpty());

        do {
            System.out.println("saisir le nombre de cages: ");
            nbrCages = myObj.nextInt();
        } while (nbrCages <= 0);
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}
