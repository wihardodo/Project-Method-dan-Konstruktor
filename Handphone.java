package handphone;
public class Handphone {
    String merk;
    String tombol;
    int tahunbuat;
    String merk;
    boolean nama;
    
public void menyala(){
        System.out.println("menyala");
   }   
public void menelfon(){
        System.out.println("menelfon");}
public void chat(){
        System.out.println("chat");}

}
//method handphone
private class Handphone{
    public static void main(String[] args){
        Method Handhphone=new Handphone();
        method.HandphoneMenyalakan();
        System.out.println(method.matikanHandphone);
    }
}

//konstruktor
public class Handphone {
    String nama;
    
    Handphone() {
        nama="Samsung Galaxy S7";
    }
}
public class Handphone{
    String nama;
    //keyword this
    public Handphone(){
        this("Hanphone");
        this.nama="menyalakan handphone";
    }
    public Handphone(String nama){
        this.nama=nama;
    }
}
//method overloading

public static void main(String [] args) {
    MethodOverloading method=new MethodOverloading();
    method.methodMenyalakan("Nyalakan tombol on off");
    method.methodMenyalakan("Nyalakan tombol on off","hingga hidup");
}
private void methodMenyalakan(String nama){
    System.out.println(nama);
}
  private void methodMenyalakan(String nama1, String nama2){
    System.out.println(nama1+nama2);
}