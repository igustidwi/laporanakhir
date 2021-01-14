
package entity07230;

public class PegawaiEntity07230 extends PelamarAbstractEntity07230{
    private String alamat;

    public PegawaiEntity07230(String nip, String password, String nama,String alamat) {
        super(nip,password,nama);
        this.alamat = alamat;
    }
    @Override
    public String getNip(){
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
