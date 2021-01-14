package Model07230;
import entity07230.DaftarPegawaiEntity07230;
import entity07230.PekerjaanEntity07230;
import java.text.ParseException;
import java.util.ArrayList;
public class DaftarPegawaiModel07230 implements ModelInterfaces07230{
    private ArrayList<DaftarPegawaiEntity07230> daftarkerjaArrayList;
    public DaftarPegawaiModel07230(){
        daftarkerjaArrayList = new ArrayList<DaftarPegawaiEntity07230>();
    }
    public void insertDataDaftarkerja(DaftarPegawaiEntity07230 daftarkerja){
       daftarkerjaArrayList.add(daftarkerja);
    }
    public ArrayList<DaftarPegawaiEntity07230> getDaftarkerjaArrayList(){
        return daftarkerjaArrayList;
    }
    public void remove(int index){
        daftarkerjaArrayList.remove(index);
    }
    public int size(){
        return daftarkerjaArrayList.size();
    }

    public ArrayList<DaftarPegawaiEntity07230>DaftarkerjaEntity(){
        return daftarkerjaArrayList;
    }
    @Override
    public int cekData(String nip, String password){
        int loop = 0;
        if(daftarkerjaArrayList.size()==0){
            loop = -1;
        }else{
        for(int i=0;i<daftarkerjaArrayList.size();i++){
            if(showDaftarkerja(i).getPegawai().getNip().equals(nip)){
                loop = i;
                break;
            }
            else{
                loop = -2;
            }
            }
        }
        return loop;
    }
    public DaftarPegawaiEntity07230 showDaftarkerja(int index){
        return daftarkerjaArrayList.get(index);
    }
    public ArrayList<DaftarPegawaiEntity07230>alldatabarang(){
        return daftarkerjaArrayList;
    }
}

