public class MarathonTest {
    public static void main(String[] args) {
        int[] timeArray = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265}; //Koşucuların sürelerinin bulunduğu dizi.
        String[] nameArray = {"Kadir "+timeArray[0]+"'","Gökhan "+timeArray[1]+"'","Hakan "+timeArray[2]+"'","Suzan "+timeArray[3]+"'","Pınar "+timeArray[4]+"'","Mehmet "+timeArray[5]+"'",
                "Ali "+timeArray[6]+"'","Emel "+timeArray[7]+"'","Fırat "+timeArray[8]+"'","James "+timeArray[9]+"'","Jale "+timeArray[10]+"'","Ersin "+timeArray[11]+"'",
                "Deniz "+timeArray[12]+"'","Gözde "+timeArray[13]+"'","Anıl "+timeArray[14]+"'","Burak "+timeArray[15]+"'"}; //Koşucuların isimlerinin ve sürelerinin olduğu dizi.
                // Direk Stringin içine "Kadir 341'" yazmak yerine +timeArray şeklinde yazma sebebim süre dizisinde bir süreyi değiştirmek istendiği zaman iki işlem yerine tek işlemin yeterli olmassı


        Marathon myMarathon = new Marathon(timeArray, nameArray);
        myMarathon.processMarathon();
        myMarathon.outputChart();
    }
}