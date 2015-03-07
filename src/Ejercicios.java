import java.util.ArrayList;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		// is el valor de b no es igual a 0 entonces divide a entre b
		// si no retorna el valor de 0
		try
		{
		return (a/b);
		}catch(Exception e)
		{
			return 0;
		}
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		// Si la posicion es menor a la longitud del arreglo y mayor a 0
		// entonces devuelve la posicion en el arreglo
		try
		{
		return arreglo[pos];
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		
		try
		{
			return mi_clase.x;
		}
		catch(NullPointerException e)
		{
		return 0;
		}
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		// define cant como 0 y Promedio ambos numeros
		int cant=0,Prom;
		// Para cada numero en mi_lista hace un ciclo, y suma el numero a la cantidad
		for(Integer numero : mi_lista)
				{
			cant = numero+cant;
				}
		// Divide la cantidad de notas, por el tama�o actual del arreglo mi_lista
			Prom= cant/mi_lista.size();
		// retorna el valor prom
		return Prom;
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		// define la variable menor como el numero maximo del arreglo Integer
		int menor = Integer.MAX_VALUE;
		// crea un ciclo en donde i parte de 0 y es menor que el tama�o actual
		// de mi_lista
		for(int i=0;i<mi_lista.size();i++)
		{
			// si la variable menor es mayor a la posicion i de la lista
			// que asigne el valor a menor
			if(menor > mi_lista.get(i)) menor=mi_lista.get(i);
		}
		// devuelve el valor de menor
		return menor;
	}
	
	//Devuelve la cantidad de veces que existe 'str' (dado) en mi_lista (dado)
	static int contar(ArrayList<String> mi_lista, String str)
	{
		// inicia un contador a 0, y el largo como el tama�o actual de mi_lista
		int cont=0;
		int largo = mi_lista.size();
		// comienza un ciclo en que i sea menor que el largo de la lista
		for(int i=0;i<largo;i++)
		{
			// si la variable str esta en mi lista en la posicion i, se le agrega uno al contador
			if(str==mi_lista.get(i)) cont=cont+1;
		}
		// retorna el valor del contador
		return cont;
	}
	
	public static void main(String[] args)
	{ 
	}

}
