public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    String getnoPlatKendaraan() {
        return this.noPlat;
    }

    String getJenisKendaraan() {
        return this.jenis;
    }

    public void setnoPlatKendaraan(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenisKendaraan(String jenis) {
        this.jenis = jenis;
    }

}
