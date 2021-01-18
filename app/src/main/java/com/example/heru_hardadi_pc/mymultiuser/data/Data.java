package com.example.heru_hardadi_pc.mymultiuser.data;

/**
 * Created by Kuncoro on 26/03/2016.
 */
public class Data {
    private String id, tanggal, alamat, jam, atasnama, acara, team;

    public Data() {
    }

    public Data(String id, String tanggal, String alamat, String jam, String atasnama, String acara, String team) {
        this.id = id;
        this.tanggal = tanggal;
        this.alamat = alamat;
        this.jam = jam;
        this.atasnama = atasnama;
        this.acara = acara;
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getAtasnama() {
        return atasnama;
    }

    public void setAtasnama(String atasnama) {
        this.atasnama = atasnama;
    }

    public String getAcara() {
        return acara;
    }

    public void setAcara(String acara) {
        this.acara = acara;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
