import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba) {
				case 1:
					System.out.println("Zadejte pocet studentu");
					try {
						mojeDatabaze = new Databaze(sc.nextInt());
					} catch (InputMismatchException e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
						System.out.println("Nezadali jste CELE cislo!");
					} catch (NegativeArraySizeException e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
						System.out.println("Nezadali jste KLADNE cislo!");
					}


					break;
				case 2:
					try {
						mojeDatabaze.setStudent();
					} catch (InputMismatchException e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
						System.out.println("Musite zadat tvar: JMENO ROK_NAROZENI!");
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
						System.out.println("Zadavate spatny index databaze!");
					}

					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");

					try {
						idx = sc.nextInt();
						prumer = sc.nextFloat();
						mojeDatabaze.setPrumer(idx, prumer);
					} catch (InputMismatchException e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
						System.out.println("Musite zadat kladny celociselny index a kladne desetinne cislo s teckou napr. 0, 1.0!");
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
						System.out.println("Zadavate spatny index databaze!");
					} catch (NullPointerException e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
						System.out.println("Databaze neni definovana!");
					} catch (MojeVyjimka e) {
						System.out.println("Nastala vyjimka typu " + e.toString());
					}


					break;
				case 4:
					System.out.println("Zadejte index studenta");
					idx=sc.nextInt();
					try {
						Student info=mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Nastala vyjimka typu " +e.toString());
						System.out.println("Zadavate index ktery neni v databazi!");
					}
					catch (NullPointerException e) {
						System.out.println("Nastala vyjimka typu " +e.toString());
						System.out.println("Databaze neni definovana!");
					}
					catch (NegativeArraySizeException e) {
						System.out.println("Nastala vyjimka typu " +e.toString());
						System.out.println("Nezadali jste KLADNE cislo!");
					}
					break;
				case 5:
					run=false;
					break;
			}

		}
	}
	}

