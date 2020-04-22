/* 	Rulia
	130 2018 0064
*/

//nomor 6
//Program menggabungkan antar abstract class dan interface
public class Driver {
 public static void main (String[] args){
  Kucing k = new Kucing("Kucing",4,"Meong meong", "Coklat");
  k.displayData();
  System.out.println();
    Sapi b = new Sapi("Sapi",4,"Moooo", "Putih corak Hitam");
  b.displayData();
  System.out.println();
  
 }
}