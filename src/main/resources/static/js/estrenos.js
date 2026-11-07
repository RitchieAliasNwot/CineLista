/**
 * estrenos.js
 * -----------
 * Pide los estrenos a la API (GET /api/estrenos) y monta un
 * <TarjetaEstreno> por cada uno dentro de <ul id="lista-estrenos">.
 *
 * Se carga desde templates/estrenos.html DESPUES de TarjetaEstreno.js:
 *   <script type="text/babel" src="/js/componentes/TarjetaEstreno.js"></script>
 *   <script type="text/babel" src="/js/estrenos.js"></script>
 *
 * La API devuelve un array JSON con este formato (ver static/data/estrenos.json):
 *   [
 *     { "id": 1, "titulo": "Nebula Roja", "fechaEstreno": "2026-11-14",
 *       "genero": "Ciencia ficcion", "plataforma": "Netflix" },
 *     ...
 *   ]
 */
// TODO 1: crea un estado "estrenos" (array vacio por defecto) con
//         React.useState([]). Necesitas tambien su funcion "setEstrenos".


// TODO 2: usa React.useEffect (con el array de dependencias vacio []
//         para que se ejecute UNA sola vez al montar el componente) y
//         dentro haz fetch("/api/estrenos"):
//           - convierte la respuesta con res.json()
//           - guarda los datos con setEstrenos(data)
//           - en el .catch() muestra el error con console.error(...)


// TODO 3: devuelve un <TarjetaEstreno> por cada elemento de "estrenos"
//         usando .map(). Recuerda:
//           - la prop "key" debe ser un valor unico (usa estreno.id)
//           - pasa las props titulo, fechaEstreno, genero y plataforma
//             tal y como las define TarjetaEstreno.js
//
// Mientras no lo completes, el componente no pinta nada:

function ListaEstrenos() {
    const [estrenos, setEstrenos] = React.useState([]);
    const [cargando, setCargando] = React.useState(true);
    const [error, setError] = React.useState(null);
    React.useEffect(() => {
        fetch("/api/estrenos")
            .then((res) => {
                if (!res.ok) throw new Error("No se pudieron cargar los estrenos");
                return res.json();
            })
            .then(setEstrenos)
            .catch((err) => setError(err.message))
            .finally(() => setCargando(false));
    }, []); // array vacío: se ejecuta solo una vez, al montar el componente
    if (cargando) return <li>Cargando...</li>;
    if (error) return <li role="alert">{error}</li>;
    return estrenos.map((estreno, i) => (
        <TarjetaEstreno
            key={i}
            titulo={estreno.titulo}
            fechaEstreno={estreno.fechaEstreno}
            genero={estreno.genero}
            plataforma={estreno.plataforma}
        />
    ));
}

// Monta la lista en el <ul id="lista-estrenos"> de estrenos.html.
// (Este bloque ya viene resuelto, no hace falta tocarlo.)
const contenedor = document.getElementById("lista-estrenos");
const raiz = ReactDOM.createRoot(contenedor);
raiz.render(<ListaEstrenos />);