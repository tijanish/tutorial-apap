package apap.tutorial.pergipergi.model;

public class TravelAgensiModel {
    private String idAgensi;
    private String namaAgensi;
    private String alamat;
    private String noTelepon;

    public TravelAgensiModel(String idAgensi, String namaAgensi, String alamat, String noTelepon) {
        this.idAgensi = idAgensi;
        this.namaAgensi = namaAgensi;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getIdAgensi()
    {
        return idAgensi;
    }

    public String getNamaAgensi()
    {
        return namaAgensi;
    }

    public String getAlamat()
    {
        return alamat;
    }

    public String getNoTelepon()
    {
        return noTelepon;
    }

    public void setIdAgensi(String idAgensi)
    {
        this.idAgensi = idAgensi;
    }

    public void setNamaAgensi(String namaAgensi)
    {
        this.namaAgensi = namaAgensi;
    }

    public void setAlamat(String alamat)
    {
        this.alamat = alamat;
    }

    public void setNoTelepon(String noTelepon)
    {
        this.noTelepon = noTelepon;
    }
}

