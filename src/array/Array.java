package array;

public class Array {

    private static int[] nilai;

    public static void main(String[] args) {
        //array adalah sebuah keranjang yang menampung adata dengan tipe data yg sama

//ARRAY YANG TIDAK DI BATASI
//        int [] umur = {12, 13, 14};
//        String [] nama = {"joko", "udin", "lulu"};
//        System.out.println(nama[2]);
        

//ARRAY DI BATASI
        int [] angka = new int[4];
        nilai[0]=1;
        nilai[1]=2;
        nilai[2]=3;
        nilai[3]=4;
        System.out.println(nilai[2]);
    }
    
}
