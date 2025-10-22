package week9.TugasWeek9;

public abstract class KendaraanListrik implements KonsumsiEnergi{
    protected double kapasitasBaterai;
    protected double dayaSaatIni;
    protected double kecepatanPengisian;

    public KendaraanListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    public abstract  double hitungWaktuPengisian();

    @Override
    public double hitungEnergiDibutuhkan(){
        return kapasitasBaterai - dayaSaatIni;
    }
}
