
package entity07230;

public class DirutEntity07230 extends PelamarAbstractEntity07230{
    
    public DirutEntity07230(String nip, String nama, String password) {
        super(nip, nama, password);
        
    }
    @Override
    public String getNip(){
        return nip;
    }
    public String getPassword(){
        return password;
    }
    
}
