 class Anjing {
     String nama;
     String warnaBulu;
     String ras;
     int umur;
     double beratBadan;

     Anjing(String nama,String warnaBulu,String ras, int umur, double beratBadan){
         this.nama = nama;
         this.warnaBulu = warnaBulu;
         this.ras =ras;
         this.umur = umur;
         this.beratBadan = beratBadan;

     }

     void gonggong(){
         System.out.println(nama + " woof! woof! ");
     }

     void info(){
         System.out.println("Nama: "+ nama);
         System.out.println("Warna Bulu: " + warnaBulu);
         System.out.println("Ras: " + ras);
         System.out.println("Umur: " + umur);
         System.out.println("Berat Badan : " + beratBadan);
     }

     void makan(double porsiMakan){
         beratBadan += porsiMakan;
         System.out.println(nama + " makan dan berat badan nya bertambah menjadi "+beratBadan+ " kg");
     }

     void berlari(double jarak){
         double penguranganBerat = jarak * 0.1;
         beratBadan -= penguranganBerat;
         System.out.println(nama + " berlari sejauh "+ jarak+ " km dan berat badannya berkurang menjadi " + beratBadan + " kg");
     }


}
