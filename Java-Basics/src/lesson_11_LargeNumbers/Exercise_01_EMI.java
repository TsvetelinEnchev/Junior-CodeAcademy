package lesson_11_LargeNumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Приравнена месечна вноска e фиксирана сума за плащане,
//направена от кредитополучател на кредитор на определена дата всеки календарен месец.
//Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец,
//така че за определен брой години заемът се изплаща изцяло заедно с лихвите. /източник wikipedia/
//Годишната вноска се изчислява по формулата:
//Където:
//P е заетата сума
//r е годишната лихва
//n е броят на вноските
//За да изчислите месечната вноска, трябва да разделите ‘r’ на 12.
//Купил съм си апартамент, за който съм заел от банка 10 000 000 евро при годишна лихва 10.5%
//и смятам да го изплатя за 10 години.
//Колко ще е моята месечна вноска?

public class Exercise_01_EMI {
    public static void main(String[] args) {

        BigDecimal amountBorrowed = new BigDecimal("10000000");
        BigDecimal annualInterest = new BigDecimal("10.5").divide(new BigDecimal("12"));
        BigDecimal interesPerMonth = annualInterest.divide(BigDecimal.valueOf(100));

        int allContributions = 12 * 10;

        BigDecimal firstRow = (interesPerMonth.multiply((interesPerMonth.add(BigDecimal.valueOf(1))).pow(allContributions)));
        BigDecimal secondRow = (interesPerMonth.add(BigDecimal.valueOf(1)).pow(allContributions).subtract(BigDecimal.valueOf(1)));
        BigDecimal result = amountBorrowed.multiply(firstRow.divide(secondRow, RoundingMode.HALF_UP));

        System.out.println(result.setScale(10,RoundingMode.HALF_UP));

    }
}
