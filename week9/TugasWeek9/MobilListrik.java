package week9.TugasWeek9;

public class MobilListrik extends KendaraanListrik{
    public MobilListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian(){
        double waktu = (kapasitasBaterai - dayaSaatIni) / kecepatanPengisian;
        return waktu * 1.1;
    }
    
}
