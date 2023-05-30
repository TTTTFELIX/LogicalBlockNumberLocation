import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      create variables 
        Scanner scanner = new Scanner(System.in);
        int logical_block_number = -1;
        int number_of_cylinders = -1;
        int number_of_tracks = -1;
        int number_of_sectors = -1;
        int sectorSize = -1;
        int remainingBlocks = -1;
        int track = -1;
        int cylinder = -1;
        int sector = -1;

//      ask for user input
        System.out.print("Enter a logical block number: ");
        logical_block_number = scanner.nextInt();

        System.out.print("Enter HD number of cylinders: ");
        number_of_cylinders = scanner.nextInt();

        System.out.print("Enter HD number of tracks: ");
        number_of_tracks = scanner.nextInt();

        System.out.print("Enter HD number of sectors: ");
        number_of_sectors = scanner.nextInt();


//      calculate the cylinder, track, and sector numbers
        sectorSize = number_of_cylinders * number_of_tracks * number_of_sectors;
        cylinder = logical_block_number / sectorSize;
        remainingBlocks = logical_block_number % sectorSize;
        track = remainingBlocks / number_of_sectors;
        sector = remainingBlocks % number_of_sectors;

//      print result
        System.out.println("The logical block number " + logical_block_number + " is located at < " + cylinder + ", " + track + ", " + sector + " >");
        
    }
}