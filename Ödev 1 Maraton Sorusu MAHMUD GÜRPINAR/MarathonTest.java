public class MarathonTest {
    public static void main(String[] args) {
        int[] timeArray = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        String[] nameArray = {"Kadir 341'","Gökhan 273'","Hakan 278'","Suzan 329'","Pınar 445'","Mehmet 402'","Ali 388'","Emel 270'",
                "Fırat 243'","James 334'","Jale 412'","Ersin 393'","Deniz 299'","Gözde 343'","Anıl 317'","Burak 265'"};


        Marathon myMarathon = new Marathon(timeArray, nameArray);
        myMarathon.processMarathon();
        myMarathon.outputChart();
    }
}