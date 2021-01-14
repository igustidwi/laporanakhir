
package entity07230;

public abstract class PelamarAbstractEntity07230 {
    protected String nip,nama;
    public String password;

    public PelamarAbstractEntity07230(String nip, String password, String nama) {
        this.nip = nip;
        this.password = password;
        this.nama = nama;
    }
    public PelamarAbstractEntity07230(){

}
    public abstract String getNip();

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}

