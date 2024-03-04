public class Marathon {

    private final int[] time;

    private final String[] name;

    public Marathon(int[] time, String[] name) {
        this.time = time;
        this.name = name;
    }

    public void processMarathon() {

        System.out.println("Birinci: " + name[first()]);
        System.out.println("İkinci: " + name[second()]);
        System.out.println("Üçüncü: " + name[third()]);
    }

    public void outputChart() {
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


    public int first() {
        int firstTime = time[0], count1 = 0;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < firstTime) {
                firstTime = time[i];
                count1 = i;
            }
        }
        return count1;
    }

    public int second() {
        int secondTime = time[0], count2 = 0;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < secondTime && time[i] > time[first()]) {
                secondTime = time[i];
                count2 = i;
            }
        }
        return count2;
    }

    public int third() {
        int thirdTime = time[0], count3 = 0;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < thirdTime && time[i] > time[second()]) {
                thirdTime = time[i];
                count3 = i;
            }
        }
        return count3;
    }
}