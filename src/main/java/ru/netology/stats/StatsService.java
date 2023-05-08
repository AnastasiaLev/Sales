package ru.netology.stats;

public class StatsService {
    public long sun(long[] sales) {
        long allsale = 0;
        for (long sale : sales) {
            allsale += sale;
        }
        return allsale;
    }

    public long average(long[] sales) {
        return sun(sales) / sales.length;
    }

    public int MaximumSale(long[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int MinimumSale(long[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int belowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }


    public int aboveAaverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}
