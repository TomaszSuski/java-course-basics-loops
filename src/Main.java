import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Main {

    public static void main(String[] args){

//        Pętle DO WHILE

        String[] kursyProgramowania =
                {
                        "Java",
                        "Java Aplikacje",
                        "Java Strumienie",
                        "Java Aspekty Zaawansowane",
                        "Java Android",
                        "C#",
                        "C# Tworzenie Aplikacji",
                        "C# LINQ",
                        "Pascal"
                };
        int i = 0;
        while(i < kursyProgramowania.length)
        {
            System.out.println(kursyProgramowania[i]);

            i++;
        }
      /*
        i = 0;
        do
        {
           System.out.println(kursyProgramowania[i]);

            i++;
       }while(i < kursyProgramowania.length);
              */

        //    ćwiczenie
        int[] tab = new int[10];

        int j = 1;

        while(j <= tab.length) {
            tab[j -1] = 10 * j;
            System.out.println(tab[j - 1]);

            j++;
        }


//        Pętle FOR
//            prosty for loop


        for (int k = 0; k < kursyProgramowania.length; k++){
            System.out.println(kursyProgramowania[k]);
        }

//        enhanced for

        for (int courseName: tab){
            System.out.println(courseName);
        }


//      Pętle w pętlach

        for (int l = 1; l <= 10; l++){
            for (int m = 1; m <= 10; m++){
                System.out.print(l * m + " ");
            }
            System.out.println();
        }


//      instrukcje BREAK i CONTINUE


        // CONTINUE
        for (int n = 0; n < 60; n++)
        {
            if (n % 2 != 0)
                continue; //przerwij iteracje od tego momentu i nie wykonuj już żadnych instrukcji po mnie
                            // ale kontynuuj całą pętlę dalej

            System.out.println(n);
        }


        // BREAK
        for (int o = 0; o < 60; o++)
        {
        if (o == 3) break; // break przerywa działanie całej petli w momencie jego wywołania
        System.out.println(o);
        }


    }


}
