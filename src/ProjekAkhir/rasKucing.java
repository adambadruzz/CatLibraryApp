package ProjekAkhir;
public class rasKucing {
    protected String nama;
    protected String asal;
    protected String umur;
    protected Integer tahunmuncul,tahunsekarang;
    protected Integer beratbadan;
    protected String warnamata;
    protected String harga;
    
    public void setNama(String Nm)
    {
        nama = Nm;
    }
    public String getNama()
    {
        return nama;
    }
    
    public void setAsal(String as){
        asal = as;
    }
    
    public String getAsal(){
        return asal;
    }
    
    public void setUmur(String ur){
        umur = ur;
    }
    
    public void setUmur(int tm, int ts){
        tahunmuncul = tm;
        tahunsekarang = ts;
    }
    
    public Integer getUmur2(){
        return tahunsekarang-tahunmuncul;
    }
    
    public String getUmur1(){
    return umur;
    }
    
    public void setBeratbadan (int bb){
        beratbadan = bb;
    }
    
    public Integer getBeratbadan(){
        return beratbadan;
    }
    
    public void setWarnamata (String wm){
        warnamata =wm;
    }
    
    public String getWarnamata(){
        return warnamata;
    }
    
    public void setHarga(String Hg)
    {
        harga = Hg;
    }
    public String getHarga()
    {
        return harga;
    }
    
}
