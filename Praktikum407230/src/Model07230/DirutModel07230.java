
package Model07230;
import entity07230.DirutEntity07230;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class DirutModel07230 implements ModelInterfaces07230{
    private ArrayList<DirutEntity07230> dirutEntityArrayList;

    public DirutModel07230(){
    dirutEntityArrayList = new ArrayList<DirutEntity07230>();
}
public DirutEntity07230 showDataDirut(int index){
    return dirutEntityArrayList.get(index);
}

    public ArrayList<DirutEntity07230> dirutEntity() {
        return dirutEntityArrayList;
    }
    

    public void insertDirut(DirutEntity07230 dirut){
        dirutEntityArrayList.add(dirut);
    }

@Override
public int cekData(String nip, String password){
    int loop = -1;
    for(int i=0; i<dirutEntity().size();i++){
        if(nip.equals(dirutEntity().get(i).getNip())&& password.equals(dirutEntity().get(i).getPassword())){
            loop = i;
        }
    }return loop;
}
}
