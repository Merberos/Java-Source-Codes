import java.util.Random;

public class ImprovedKostka {
    public static void main(String[] args)
    throws java.io.IOException {
        Random kostka = new Random();
        char wybor, ignorowane;
        
        System.out.println("Witaj graczu");
        System.out.println("<fanfary lecące w tle>");
        System.out.println("Oto dwunastościenna kostka, która idealnie nada się do Twojej gry.");
        System.out.println("Czy rzucić kostką? t/n");

        do{
            wybor = (char) System.in.read();

            do{
                ignorowane = (char) System.in.read();
            } while(ignorowane != '\n');
            
            int liczba = kostka.nextInt(12);
            liczba += 1;
            switch(liczba){
                case 1:
                    System.out.println("Wypadła jedynka");
                    break;
                case 2:
                    System.out.println("Wypadła dwójka");
                    break;
                case 3:
                    System.out.println("Wypadła trójka");
                    break;
                case 4:
                    System.out.println("Wypadła czwórka");
                    break;
                case 5:
                    System.out.println("Wypadła dwójka");
                    break;
                case 6:
                    System.out.println("Wypadła szóstka");
                    break;
                case 7:
                    System.out.println("Wypadła siódemka");
                    break;
                case 8:
                    System.out.println("Wypadła ósemka");
                    break;
                case 9:
                    System.out.println("Wypadła dziewiątka");
                    break;
                case 10:
                    System.out.println("Wypadła dziesiątka");
                    break;
                case 11:
                    System.out.println("Wypadła jedenastka");
                    break;
                case 12:
                    System.out.println("Wypadła dwunastka");
                    break;
            }
            System.out.println("Czy ponownie rzucić kostką? t/n");
        } while(wybor == 't');
        System.out.println("Zakończono działanie kostki");
    }
}
