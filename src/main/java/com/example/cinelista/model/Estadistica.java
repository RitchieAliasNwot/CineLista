package com.example.cinelista.model;

/**
 * Representa una fila de la tabla de la seccion "Estadisticas"
 * (datos estaticos consumidos via GET /api/estadisticas por DataTables).
 *
 * De momento solo tiene "id" y "titulo", a juego con el resto del proyecto.
 *
 * TODO: anadid el resto de campos, con su getter y su setter:
 *  - genero         (String)
 *  - taquilla       (long)
 *  - nota           (int)
 */
public class Estadistica {

    private Long id;
    private String titulo;
    private String genero;
    private long taquilla;

    public Estadistica(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }    
    
    public Estadistica(String titulo, String genero, long taquilla, int nota) {
        this.titulo = titulo;
        this.genero = genero;
        this.taquilla = taquilla;
        this.nota = nota;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTaquilla(long taquilla) {
        this.taquilla = taquilla;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    private int nota;

    
    public String getGenero() {
        return genero;
    }

    public long getTaquilla() {
        return taquilla;
    }

    public int getNota() {
        return nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
