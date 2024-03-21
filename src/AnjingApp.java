public class AnjingApp {
    public static void main(String[] args) {
        Anjing anjing1 = new Anjing("Bonnie","hitam putih","Poodle", 1,2.2);
        Anjing anjing2 = new Anjing("Luli","cream","pomeranian",1,1);
        Anjing anjing3 = new Anjing("Milo","cream putih", "shih tzu", 1 , 1);


        anjing1.gonggong();
        anjing1.info();
        anjing1.makan(0.5);
        anjing1.berlari(3.0);

        anjing2.gonggong();
        anjing2.info();
        anjing2.makan(0.2);
        anjing2.berlari(2.0);

        anjing3.gonggong();
        anjing3.info();
        anjing3.makan(0.6);
        anjing3.berlari(5.0);
    }
}
