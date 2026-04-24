# Reto 005

Diseño e implementación de una simulació de carrera de caballos.

## Punto de partida

```java
class Juego {
    public static void main(String[] args){
        Carrera carrera = new Carrera();
        carrera.jugar();
    }
}
```

##

- La carrera se dusputa en una pista de 40 posiciones.
- Al inicio empieza el caballo (por azar).
- El caballo en juego avanza 0, 1 o 2 casillas.
- Cada turno muestra el estado de la pista.
- El juego termina cuando uno de los caballos llega al final de la pista.
- Al final de la carrera puede haber empate.

## Sugerencia de presentación

```text
----------------------------------------------
;-;'
;-;'
----------------------------------------------

(...)

----------------------------------------------
           ;-;'
                   ;-;'
----------------------------------------------

(...)

----------------------------------------------
                                          ;-;'
                                   ;-;'
----------------------------------------------
Ganó el caballo 1
```
