package org.insbaixcamp.excusasparaelgym

import androidx.annotation.ColorRes


enum class TipoPereza(
    val titulo: String,
    @get:ColorRes val colorResId: Int,
    @get:ColorRes val colorBgResId: Int
) {
    LIGERA("Pereza Ligera", R.color.pereza_ligera, R.color.pereza_ligera_bg),
    MODERADA("Pereza Moderada", R.color.pereza_moderada, R.color.pereza_moderada_bg),
    EXTREMA("Pereza Extrema", R.color.pereza_extrema, R.color.pereza_extrema_bg),
    ABSOLUTA("Absoluta Pereza", R.color.pereza_absoluta, R.color.pereza_absoluta_bg)
}


data class Excusa(
    val id: Int,
    val texto: String,
    val tipoPereza: TipoPereza
)


object ExcusasRepository {

    val listaExcusas: List<Excusa> = listOf(
        // ================= PERIZA LIGERA (VERDE) =================
        Excusa(
            id = 1,
            texto = "Hoy solo iré si encuentro los calcetines a la primera... y no los encuentro.",
            tipoPereza = TipoPereza.LIGERA
        ),
        Excusa(
            id = 2,
            texto = "El café pre-entreno me dio sueño en vez de energía.",
            tipoPereza = TipoPereza.LIGERA
        ),
        Excusa(
            id = 3,
            texto = "Está medio nublado y parece que va a llover... mejor no arriesgarse.",
            tipoPereza = TipoPereza.LIGERA
        ),
        Excusa(
            id = 4,
            texto = "Tengo que poner una lavadora con la ropa deportiva antes de poder ponérmela.",
            tipoPereza = TipoPereza.LIGERA
        ),
        Excusa(
            id = 5,
            texto = "Olvidé cargar los auriculares y entrenar sin música es un peligro para la salud mental.",
            tipoPereza = TipoPereza.LIGERA
        ),
        Excusa(
            id = 6,
            texto = "Llegué un poco tarde del trabajo y mi serie favorita acaba de estrenar episodio.",
            tipoPereza = TipoPereza.LIGERA
        ),
        Excusa(
            id = 7,
            texto = "Me corté las uñas hace un rato y me quedaron demasiado sensibles para agarrar la barra.",
            tipoPereza = TipoPereza.LIGERA
        ),

        // ================= PEREZA MODERADA (AMARILLO) =================
        Excusa(
            id = 8,
            texto = "Hoy me duele un músculo que ni siquiera sabía que existía en la anatomía humana.",
            tipoPereza = TipoPereza.MODERADA
        ),
        Excusa(
            id = 9,
            texto = "Leí en un artículo médico que sobreentrenar es perjudicial, así que hoy aplico prudencia.",
            tipoPereza = TipoPereza.MODERADA
        ),
        Excusa(
            id = 10,
            texto = "A esta hora el gimnasio está lleno de gente y no pienso hacer fila para una máquina.",
            tipoPereza = TipoPereza.MODERADA
        ),
        Excusa(
            id = 11,
            texto = "Comí hace 45 minutos y los expertos recomiendan hacer la digestión completamente en reposo.",
            tipoPereza = TipoPereza.MODERADA
        ),
        Excusa(
            id = 12,
            texto = "Hice 6000 pasos en el trabajo hoy, eso técnicamente ya cuenta como sesión de cardio.",
            tipoPereza = TipoPereza.MODERADA
        ),
        Excusa(
            id = 13,
            texto = "Mis zapatillas favoritas aún no se han secado del todo y no quiero lesionarme.",
            tipoPereza = TipoPereza.MODERADA
        ),
        Excusa(
            id = 14,
            texto = "Todavía tengo agujetas residuales de las sentadillas del mes pasado.",
            tipoPereza = TipoPereza.MODERADA
        ),

        // ================= PEREZA EXTREMA (ROJO) =================
        Excusa(
            id = 15,
            texto = "Siento que hoy la gravedad en mi casa está al menos un 30% más pesada que ayer.",
            tipoPereza = TipoPereza.EXTREMA
        ),
        Excusa(
            id = 16,
            texto = "El universo me envió una señal clara: parpadeó la bombilla del salón justo al coger la mochila.",
            tipoPereza = TipoPereza.EXTREMA
        ),
        Excusa(
            id = 17,
            texto = "Mi horóscopo dice explícitamente que hoy debo evitar esfuerzos físicos o decisiones precipitadas.",
            tipoPereza = TipoPereza.EXTREMA
        ),
        Excusa(
            id = 18,
            texto = "Entré en calor solo de pensar en la rutina de pierna, doy el día por completado.",
            tipoPereza = TipoPereza.EXTREMA
        ),
        Excusa(
            id = 19,
            texto = "Estornudé dos veces seguidas, es claramente un resfriado que debo combatir desde la cama.",
            tipoPereza = TipoPereza.EXTREMA
        ),
        Excusa(
            id = 20,
            texto = "El sofá y yo hemos alcanzado un equilibrio termodinámico perfecto que no se debe romper.",
            tipoPereza = TipoPereza.EXTREMA
        ),
        Excusa(
            id = 21,
            texto = "Iba a salir pero vi un video motivacional tan largo que ya se me hizo la hora de cenar.",
            tipoPereza = TipoPereza.EXTREMA
        ),

        // ================= ABSOLUTA PEREZA (MORADO) =================
        Excusa(
            id = 22,
            texto = "Hoy me declaro en día de descarga biológica, celular y espiritual obligatoria.",
            tipoPereza = TipoPereza.ABSOLUTA
        ),
        Excusa(
            id = 23,
            texto = "Ir al gimnasio hoy alteraría mi paz interior y esa no se negocia con nadie.",
            tipoPereza = TipoPereza.ABSOLUTA
        ),
        Excusa(
            id = 24,
            texto = "Si la naturaleza hubiera querido que levantáramos 100 kg, vendríamos equipados con poleas.",
            tipoPereza = TipoPereza.ABSOLUTA
        ),
        Excusa(
            id = 25,
            texto = "Me puse la ropa de deporte y me dio tanto sueño que terminé durmiéndome con ella puesta.",
            tipoPereza = TipoPereza.ABSOLUTA
        ),
        Excusa(
            id = 26,
            texto = "Hoy he decidido ejercitar el músculo más importante: el cerebro, viendo documentales en el sofá.",
            tipoPereza = TipoPereza.ABSOLUTA
        ),
        Excusa(
            id = 27,
            texto = "Ya estamos a mitad de semana, empezar hoy arruinaría la perfecta simetría de empezar el lunes.",
            tipoPereza = TipoPereza.ABSOLUTA
        ),
        Excusa(
            id = 28,
            texto = "Moverme quemaría calorías preciosas y en estos tiempos no se puede desperdiciar nada.",
            tipoPereza = TipoPereza.ABSOLUTA
        )
    )
}
