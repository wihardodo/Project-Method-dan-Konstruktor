package handphone;
public class ClassUtama {
public static void main(String[]args){
Handphone samsung = new Handphone();

samsung.merk="Samsung Galaxy S7";
samsung.chat();} 
}
//menampilkan method handphone
private void methodMenyalakan(){
        System.out.println("Tekan tombol on off");
        }
private int matikanHandphone(){
        return 1;
        }
}
//pemanggilan konstruktor
public class PanggilKonstruktor {
  public static void main(String[] args){
      Handphone hp=new Handphone();
      System.out.println(hp.nama);
  }  
}

