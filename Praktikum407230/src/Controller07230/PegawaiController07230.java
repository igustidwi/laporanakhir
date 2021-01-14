
package Controller07230;
import entity07230.PekerjaanEntity07230;
import entity07230.DaftarPegawaiEntity07230;
import entity07230.PegawaiEntity07230;
import Model07230.DaftarPegawaiModel07230;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class PegawaiController07230 implements ControllerInterface07230{
    int indexLogin = 0;
    public PegawaiController07230(){      
    }
    public PegawaiEntity07230 getData(){
        return AllObjectModel07230.pegawaiModel.showdatapegawai(indexLogin);
    }
    public void daftarPegawai(int indexPekerjaan,PegawaiEntity07230 pegawai ){
        AllObjectModel07230.daftarkerjaModel.insertDataDaftarkerja(new DaftarPegawaiEntity07230(pegawai,indexPekerjaan));
    }
    public int size(){
        return AllObjectModel07230.daftarkerjaModel.size(); 
    }
    public void remove(int index){
        AllObjectModel07230.daftarkerjaModel.remove(index);    
    }
    @Override
    public void login(String nip , String password){
        indexLogin = AllObjectModel07230.pegawaiModel.cekData(nip,password);
    }
    
    public void insert(String nip, String password, String nama,String alamat){
       AllObjectModel07230.pegawaiModel.insert(new PegawaiEntity07230(nip,password,nama,alamat));
    }
    public PegawaiEntity07230 PraktikanEntity(){
        return AllObjectModel07230.pegawaiModel.showdatapegawai(indexLogin);
    }
    
    public int cekpegawai(String nip,String password){
        int cek = AllObjectModel07230.daftarkerjaModel.cekData(nip,password);
        return cek;   
        }
    public DaftarPegawaiEntity07230 showDaftarkerja(int index){
        return AllObjectModel07230.daftarkerjaModel.showDaftarkerja(index);
    }
    public ArrayList<PegawaiEntity07230>pegawaiEntity(){
        return AllObjectModel07230.pegawaiModel.pegawaiEntity();
    }
    public ArrayList<DaftarPegawaiEntity07230>daftarkerjaEntity(){
        return AllObjectModel07230.daftarkerjaModel.DaftarkerjaEntity();
    }
    public DefaultTableModel dataTabelpegawai(){
        DefaultTableModel dtpPgw = new DefaultTableModel();
        Object[] kolom = {"Nip","Password", "Nama", "Alamat","Pekerjaan","Gaji"};
        dtpPgw.setColumnIdentifiers(kolom);
        int size = AllObjectModel07230.daftarkerjaModel.alldatabarang().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[6];
            data[0] = AllObjectModel07230.daftarkerjaModel.showDaftarkerja(i).getPegawai().getNip();
            data[1] = AllObjectModel07230.daftarkerjaModel.showDaftarkerja(i).getPegawai().getPassword();
            data[2] = AllObjectModel07230.daftarkerjaModel.showDaftarkerja(i).getPegawai().getNama();
            data[3] = AllObjectModel07230.daftarkerjaModel.showDaftarkerja(i).getPegawai().getAlamat();
            data[4] = PekerjaanEntity07230.listPekerjaan[AllObjectModel07230.daftarkerjaModel.showDaftarkerja(i).getIndexPekerjaan()];
            data[5] = PekerjaanEntity07230.gaji[AllObjectModel07230.daftarkerjaModel.showDaftarkerja(i).getIndexPekerjaan()];
            dtpPgw.addRow(data);
        }
        return dtpPgw;
}
}

