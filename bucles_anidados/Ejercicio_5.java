package bucles_anidados;

public class Ejercicio_5 {

	public static void main(String[] args) {
		int diaInicio = 4; // 1 = lunes ... 7 = domingo (octubre de 2026 empieza en jueves)
		int diasMes = 31;
		System.out.println(" L  M  X  J  V  S  D");
		int dia = 1;
		for (int semana = 1; semana <= 6; semana++) {
			if (dia <= diasMes) {
				for (int diaSemana = 1; diaSemana <= 7; diaSemana++) {
						if (semana == 1 && diaSemana < diaInicio) {
							System.out.print("   ");
						} else if (dia <= diasMes) {
							if (dia < 10) {
								System.out.print(" ");
							}
							System.out.print(dia + " ");
							dia++;
						}
				}
				System.out.println();
			}
		}
	}
}