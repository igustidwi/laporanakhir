
package Controller07230;
import entity07230.DirutEntity07230;
import entity07230.DaftarPegawaiEntity07230;
import entity07230.PegawaiEntity07230;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class DirutController07230 implements ControllerInterface07230{
    int indexLogin;
    int cek;
public DirutController07230(){

}

   public int cekData(String nip,String password){
 
      cek = AllObjectModel07230.dirutModel.cekData(nip, password);
      return cek;
   }
    
    @Override
    public void login(String nip , String password){
        indexLogin = cekData(nip,password);
    }
    public void insert(String nip, String password, String nama){
       AllObjectModel07230.dirutModel.insertDirut(new DirutEntity07230(nip,password,nama));
    }
    public DirutEntity07230 DirutEntity() {
        return AllObjectModel07230.dirutModel.showDataDirut(indexLogin);
    }
    public ArrayList<DirutEntity07230>dirutEntity(){
        return AllObjectModel07230.dirutModel.dirutEntity();
    }
}