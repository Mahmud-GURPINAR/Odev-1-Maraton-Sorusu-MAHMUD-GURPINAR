public class Marathon {

    private final int[] time;

    private final String[] name;

    public Marathon(int[] time, String[] name) {
        this.time = time;
        this.name = name;
    }

    public void processMarathon() { //Birinci, İkinci, Üçüncü koşucuların isimlerini ve sürelerini yazdıran method.

        System.out.println("Birinci: " + name[first()]);
        System.out.println("İkinci: " + name[second()]);
        System.out.println("Üçüncü: " + name[third()]);
    }

    public void outputChart() { //Sürelerin bulunduğu dizinin tamamının içinde dolaşıp hangi aralıkta kaç koşucu olduğunu bulan ve yazdıran method.
        int A = 0, B = 0, C = 0;

        for (int time : time) {
            if (199<time && time < 300)
                A++;
            else if (time < 400)
                B++;
            else
                C++;
        }

        System.out.println("A -> " + A);
        System.out.println("B -> " + B);
        System.out.println("C -> " + C);
    }


    public int first() { //En düşük süreye sahip koşucuyu bulup onun dizideki sırasını dönderen method.
        int firstTime = time[0], count1 = 0;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < firstTime) {
                firstTime = time[i];
                count1 = i;
            }
        }
        return count1;
    }

    public int second() { //En düşük ikinci süreye sahip koşucuyu bulup onun dizideki sırasını dönderen method.
        int secondTime = 99999, count2 = 0; // seconTimeye  bu değeri girme sebebim yüksek değerli olması gerekmesi çünkü 0. indexdeki değer en küçük sayı olursa hiçbir zaman if döngüsüne girmez hatalı sonuç çıkar.

        for (int i = 0; i < time.length; i++) {
            if (time[i] < secondTime && time[i] > time[first()]) { //Koşul eğer yeni sayı ikinci en küçükten küçük ve sayı birinci methodda bulunan sıradaki süreden büyükse çalışıyor.
                secondTime = time[i];
                count2 = i;
            }
        }
        return count2;
    }

    public int third() { //En düşük üçüncü süreye sahip koşucuyu bulup onun dizideki sırasını dönderen method.
        int thirdTime = 99999, count3 = 0; // thirdTimeye  bu değeri girme sebebim yüksek değerli olması gerekmesi çünkü 0. indexdeki değer en küçük sayı olursa hiçbir zaman if döngüsüne girmez hatalı sonuç çıkar.

        for (int i = 0; i < time.length; i++) {
            if (time[i] < thirdTime && time[i] > time[second()]) { //Koşul eğer yeni sayı üçüncü en küçükten küçük ve sayı ikinci methodda bulunan sıradaki süreden büyükse çalışıyor.
                thirdTime = time[i];
                count3 = i;
            }
        }
        return count3;
    }
}