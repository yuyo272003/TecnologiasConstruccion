package Calentador
import java.util.Scanner
import TempHabitacion.TempHabitacion

class CalentadorGas : Calentador {

    var input = Scanner(System.`in`)

    override fun ajustarTemp(tempActual: TempHabitacion) {
        var continuar = true

        while (continuar) {
         println("""
             
             (i) Seleccione una opción 
             
             1. Aumentar temperatura (+2°C
             2. Atras
             
         """.trimIndent())

            var opcion: Int =input.nextInt()

            when  (opcion) {
                1 ->{
                tempActual.setTempActual(tempActual.getTempActual() + 2)
                    println(
                        """
                            Temperatura Aumentada + 2 °C
                            ----------------------------
                            Temp.Actual ${tempActual.getTempActual()}
                        """.trimIndent()
                    )
                }

                0 ->{
                    println("Regresando al menu principal...")
                    continuar = false
                }
                else -> println("Opcion invalida")
            }
        }
    }

}