
package QuanLyPhongThucHanh;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class IOFile {
    public static <T> void ghi(String fname,List<T> arr){
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fname));
            out.writeObject(arr);
            out.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static <T> List<T> doc(String fname){
        List<T> t=null;
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(fname));
            t=(List<T>)in.readObject();
            in.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return t;
    }
}
