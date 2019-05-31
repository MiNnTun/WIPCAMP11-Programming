/*
 * WIP XI Computer Programing 
 */

package XI.Project;

/**
 *
 * @author sittiwatlcp
 */
import java.util.Scanner;

public class WIPCargo {
   public static void main(String[] args) {
       int item =4;
       int limit =10;
       int number =0;
       Scanner sc = new Scanner(System.in);
        System.out.println("สินค้าในคลัง " + item + " จากทั้งหมด " + limit);
        System.out.println("1.เพื่อเพิ่มสินค้า");
        System.out.println("2.ลดสินค้า");
        System.out.println("3.เช็คจำนวนสินค้า");
        System.out.print("ใส่เลขเพื่อทำรายการ : ");
        int x = sc.nextInt();
       if( x <= 1){
        System.out.print("ใส่จำนวนสินค้า: ");
       int y = sc.nextInt();
       System.out.println("สินค้าในคลัง " + y + " จากทั้งหมด " + limit);}
       else if (x ==2){
        System.out.print("ใส่จำนวนทีจะลด: ");
       int z = sc.nextInt();
       System.out.println("สินค้าในคลัง " + (item-z) + " จากทั้งหมด " + limit);}
       else {
           System.out.println("สินค้าในคลัง " + item + " จากทั้งหมด " + limit);}
       }
           
           

    }