package Termometro

import TempHabitacion.TempHabitacion

class TermometroDigital : Termometro {
    override fun leerTemp(tempActual: TempHabitacion): Double {
        return tempActual.getTempActual()
    }

    override fun mostrarTemp(tempActual: TempHabitacion): Double {
        println(
            """
            La temperatura es: ${tempActual.getTempActual()}
        """.trimIndent()
        )
        return TODO("Provide the return value")
    }

}