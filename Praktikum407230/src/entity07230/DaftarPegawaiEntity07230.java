package entity07230;

public class DaftarPegawaiEntity07230 {
    private PegawaiEntity07230 pegawai;
    private int IndexPekerjaan;

    public DaftarPegawaiEntity07230(PegawaiEntity07230 pegawai, int IndexPekerjaan) {
        this.pegawai = pegawai;
        this.IndexPekerjaan = IndexPekerjaan;
    }

    public PegawaiEntity07230 getPegawai() {
        return pegawai;
    }

    public void setPegawai(PegawaiEntity07230 pegawai) {
        this.pegawai = pegawai;
    }

    public int getIndexPekerjaan() {
        return IndexPekerjaan;
    }

    public void setIndexPekerjaan(int IndexPekerjaan) {
        this.IndexPekerjaan = IndexPekerjaan;
    }
}

