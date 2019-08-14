package Lab2_Library;

import java.util.Scanner;

public class Library_Main {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		switch (n) {
		case 1:
			Video v = new Video();
			v.setDirector("Sukumar");
			v.setGenre("movie");
			v.setNumberOfCopies(90);
			v.setRuntime(180);
			v.setTitle("Nenokkadine");
			v.setUniqueIdNumber(25);
			v.setYearReleased(2013);

			System.out.println(v.toString());
			break;

		case 2:
			Cd c = new Cd();
			c.setArtist("Shreya");
			c.setGenre("pop");
			c.setNumberOfCopies(30);
			c.setRuntime(150);
			c.setTitle("Gaanam");
			c.setUniqueIdNumber(7);

			System.out.println(c.toString());
			break;
		case 3:
			Book b = new Book();

			b.setNumberOfCopies(60);
			b.setTitle("Funday");
			b.setUniqueIdNumber(107);
			b.setAuthor("Chand");

			System.out.println(b.toString());
			break;
		case 4:
			JournalPaper j = new JournalPaper();

			j.setNumberOfCopies(30);
			j.setTitle("Nenokkadine");
			j.setUniqueIdNumber(35);
			j.setAuthor("skumar");
			j.setYearPublished(2019);
			System.out.println(j.toString());
			break;

		}
	}

}
