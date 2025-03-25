package mx.unam.aragon.ico.te.webautos.models;

public class Auto {

    private String marca;
    private String descripcion;
    private String urlFoto;
    private String urlDetalle;

    public Auto() {

    }

    public Auto(String marca, String descripcion, String urlFoto, String urlDetalle) {
        this.marca = marca;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
        this.urlDetalle = urlDetalle;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public String getUrlDetalle() {
        return urlDetalle;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUrlDetalle(String urlDetalle) {
        this.urlDetalle = urlDetalle;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
