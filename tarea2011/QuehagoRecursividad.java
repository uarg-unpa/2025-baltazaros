public void queHago(int n) {
    if (n == 0) {
        System.out.println("¡Que mensaje puede ir aca?!"); // Caso Base
    } else {
        System.out.println(n); // Caso General
        queHago(n);
    }
}

// 2- Detectar los errores que tiene esta función recursiva.
// Considero que está mal la distribución de responsabilidades, ya que en los métodos no debería haber un SOP.
// Luego, la lógica en el caso general está mal ya que se repite infinitamente porque n nunca va a llegar a 0, que es la condición de salida. Considerando que el caso base es '== 0', podría proponer que n se reduzca por cada ciclo.
// 3- Explicar qué hace esta función tal como está escrita.
// Tal cual está escrito, es un un método que no devuelve nada, solo imprime en pantalla dos opciones de acuerdo a si n es 0 o no.
// Si n es 0, imprime un mensaje y el método se sigue ejecutando infinitamente, ya que no hay nada que lo pare.
// Si n no es 0, imprime ese mismo número infinitamente.
// 4- Proponer qué mensaje podría ir en el System.out.println.
// Obviando el hecho de que me quedó claro en la cursada que en los métodos no deben ir SOP, dada la separación de responsabilidades, mi propuesta es que podría ir "fin de la operación"

public void queHago(int n) { // Ésta podría ser una corrección, sé que no es pedida, pero interpretando que el caso general maneja un entero, y el caso base funciona cuando el entero es igual a 0, podría ser que imprima todos los numeros desde n hasta 1 (a 0 no lo imprime)
    if (n == 0) {
        System.out.println("fin de la operación"); // Caso Base
    } else {
        System.out.println(n); // Caso General
        queHago(n-1);
    }
}
