package Exercises_From_StartIt.homework_1.exercise_PrimeChecker;

import java.util.List;

public class PrimeChecker {
    public void checkPrime(List<Integer> numbers){

        for (int num: numbers) {
            if(num<=1)
            {
                numbers.remove(num);
            }
            for(int i=2;i<num/2;i++)
            {
                if((num%i)==0)
                    numbers.remove(numbers.indexOf(num));
            }
        }

        System.out.println(numbers);
    }
}
