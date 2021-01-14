
package Model07230;
import entity07230.PegawaiEntity07230;
import java.util.ArrayList;
public class PegawaiModel07230 implements ModelInterfaces07230{
    private ArrayList<PegawaiEntity07230> PegawaiEntityArrayList;
    
    public PegawaiModel07230(){
        PegawaiEntityArrayList = new ArrayList<PegawaiEntity07230>();
    }
    public void insert(PegawaiEntity07230 pegawaiEntity){
        PegawaiEntityArrayList.add(pegawaiEntity);
    }
    public int size(){
        return PegawaiEntityArrayList.size();
    }
    public void remove(int index){
        PegawaiEntityArrayList.remove(index);
    }

    public ArrayList<PegawaiEntity07230>pegawaiEntity(){
        return PegawaiEntityArrayList;
    }
    @Override
    public int cekData(String nip, String password){
        int loop = 0;
        while(!PegawaiEntityArrayList.get(loop).getNip().equals(nip)&&!PegawaiEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    public PegawaiEntity07230 showdatapegawai(int index){
        return PegawaiEntityArrayList.get(index);
    }
}
