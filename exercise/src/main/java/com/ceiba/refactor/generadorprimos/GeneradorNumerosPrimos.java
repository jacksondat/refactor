package com.ceiba.refactor.generadorprimos;

public class GeneradorNumerosPrimos {

	/**
	 * Dado un vector de enteros emepzando en 2, se tachan todos los multiplos de 2.
	 * Se encuentra el siguiente entero no tachado y se tachan todos sus multiplos.
	 * El proceso se repite hasta que se pasa la raiz cuadrada del valor maximo.
	 * Todos los numeros que queden sin tachar son numeros primos.
	 * 
	 * @param max
	 * @return Vector de numeros primos
	 */
	public int[] generarNumerosPrimos(int max)
	{
		if (max >= 2) // el unico caso valido
		{
			// declaraciones
			int s = max + 1; // tamano del arreglo
			boolean[] f = new boolean[s];
			int i;
			
			// inicializar el arregle
			for (i = 0; i < s; i++)
				f[i] = true;
			// eliminar numeros no primos conocidos
			f[0] = f[1] = false;
			
			int j;
			for (i = 2; i < Math.sqrt(s) + 1; i++)
			{
				if (f[i]) // si i es primo, se deben eliminar sus multiplos.
				{
					for (j = 2 * i; j < s; j += i)
						f[j] = false; // multiple is not prime
				}
			}
			// cuantos primos hay?
			int count = 0;
			for (i = 0; i < s; i++)
			{
				if (f[i])
					count++;
			}
			int[] primes = new int[count];
			// Rellenar el arreglo de primos
			for (i = 0, j = 0; i < s; i++)
			{
				if (f[i]) // si es primo
					primes[j++] = i;
			}
			return primes; // retorna los primos
		} else {// max < 2
			return new int[0]; // retorna un arreglo vacio si el max no es valido
		}
	}
}
