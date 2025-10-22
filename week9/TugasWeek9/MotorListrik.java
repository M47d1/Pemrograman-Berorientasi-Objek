package week9.TugasWeek9;

public class MotorListrik extends KendaraanListrik{
    public MotorListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian(){
        double waktu = (kapasitasBaterai - dayaSaatIni) / kecepatanPengisian;
        return waktu * 1.05;
    }
    
}
