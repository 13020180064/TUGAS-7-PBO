/* 	Rulia
	130 2018 0064
*/

//nomor 6
//Program menggabungkan antar abstract class dan interface
public class Sapi extends Binatang implements Herbivora{
 private String suara;
 private String warnaBulu;
  public Sapi (String nama, int jmlKaki, String suara, String warnaBulu){
  super(nama, jmlKaki);
  this.suara=suara;
  this.warnaBulu=warnaBulu;
 }
  public void displayMakan(){
  System.out.println("Jenis: "+ jenisH);
  System.out.println("Makanan: "+ makananH );
 }
 public void displayBinatang(){
  System.out.println("Nama: "+getNama());
  System.out.println("Jumlah Kaki: "+getKaki());
 }
 public void displayData(){
  displayMakan();
  displayBinatang();
  System.out.println("Suara: "+suara);
  System.out.println("Warna Bulu: "+warnaBulu);
 }
}