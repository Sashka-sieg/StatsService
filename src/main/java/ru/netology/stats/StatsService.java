package ru.netology.stats;

public class StatsService {
    public int calculationSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        return calculationSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int counter = 0;
        int averageAmount = calculationSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < averageAmount ) {
                counter++;
            }
        }
        return counter;
    }

    public int salesOverAverage(int[] sales) {
        int counter = 0;
        int averageAmount = calculationSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > averageAmount) {
                counter++;
            }
        }
        return counter;
    }
}
