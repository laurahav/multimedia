package ejercicios

class Estudiante(val nombre: String, val nota: Double, val carrera: String)

fun procesarAlumnos(alumnos: List<Estudiante>) {
    val aprobados = alumnos.filter { it -> it.nota >= 6.0 }

}