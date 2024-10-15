
Definir la clase MazoPoker que modele un mazo de cartas de Poker. El mazo contiene
 cartas numeradas del 1 al 10, más las figuras J, Q, K, en los 4 palos disponibles: Pica,
 Corazón, Diamante y Trébol. Las cartas de corazón y diamante son de color rojo, las
 otras son de color negro. Incorporar los siguientes métodos:
 Barajar el mazo
 Sacar X cartas de arriba
 Sacar X cartas de abajo
 Colocar X cartas arriba
 Colocar X cartas abajo
 Ordenar el mazo según orden de palos solicitado (en cada palo se ordena del 1
 al 10, J, Q, K)

## PartidaCartas
 Definir la clase PartidaCartas que permita agregar 2 jugadores donde a cada uno se le
 entregan 5 cartas de un mazo de póker.
 a) Implementar una versión donde gana quien suma más puntos con sus cartas (la
 J vale 11, la Q vale 12 y la K vale 13).
 b) Implementar una versión donde gana quien pueda formar un número de dos
 dígitos mayor con cartas numeradas entre 1 y 9. Por ejemplo, si tengo cartas 4,
 1, J, 6 y 10, el número de dos dígitos más grande sería 64.
 c) Implementar una versión donde gana quien tiene la mayor cantidad de cartas
 con mismo número/letra, si hay empate gana quien tiene la carta más alta.
 d) Implementar una función que verifique si un jugador tiene una jugada de
 "escalera" en la que sus cartas forman una secuencia numérica consecutiva,
 como 2-3-4-5-6. Diferenciar si la escalera es con el mismo palo o no.
 e) Agregar un método que determine si un jugador tiene cartas del mismo palo.
 f) Agregar un método que determine si un jugador tiene cartas del mismo color.
 g) Permitir la opción de jugar múltiples rondas y llevar un registro de las victorias de
 cada jugadxr a lo largo de las rondas