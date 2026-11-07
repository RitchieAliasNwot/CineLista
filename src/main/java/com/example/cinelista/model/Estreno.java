package com.example.cinelista.model;

/**
 * TarjetaEstreno
 * ---------------
 * Componente de React (sin build, cargado via Babel Standalone) que
 * muestra un estreno como una tarjeta simple.
 *
 * Se guarda en static/js/componentes/TarjetaEstreno.js y se carga desde
 * templates/estrenos.html con:
 *   <script type="text/babel" src="/js/componentes/TarjetaEstreno.js"></script>
 *
 * Props que debe recibir:
 *  - titulo        (string) Titulo del estreno.
 *  - fechaEstreno  (string) Fecha del estreno.
 *  - genero        (string) Genero del estreno.
 *  - plataforma    (string) Plataforma del estreno (Opcional).
 *
 * Evento:
 *  - Boton "Marcar interes": Al pulsar usa "alternarMarcado" para cambiar "marcado" al opuesto y la estrella
 *
 * Ejemplo de uso:
 *   <TarjetaEstreno
 *       titulo="Nebula Roja"
 *       fechaEstreno="15-12-2026"
 *       genero="Acción"
 *   />
 */
public class Estreno {

    private Long id;
    private String titulo;
    private String genero;
    private String plataforma;


    public Estreno(String titulo, String genero, String plataforma) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public Estreno(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }
}