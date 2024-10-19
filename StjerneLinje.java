public static void main(String[] args) {
    // Kald begge metoder i samme program
    // Metode fra opgave 4 - udskriver altid 20 stjerner
    stjerneLinie();

    // Metode fra opgave 5 - udskriver variabelt antal stjerner
    stjerneLinie(10);  // Udskriver 10 stjerner
    stjerneLinie(5);  // Udskriver 30 stjerner
}

// Metode fra opgave 4: Udskriver præcis 20 stjerner
public static void stjerneLinie() {
    int antalStjerner = 20;  // Lokal variabel sat til 20
    for (int i = 0; i < antalStjerner; i++) {
        System.out.print("*");
    }
    System.out.println();  // Går til næste linje efter stjernerne er udskrevet
}

// Metode fra opgave 5: Udskriver et variabelt antal stjerner givet som parameter
public static void stjerneLinie(int antalStjerner) {
    for (int i = 0; i < antalStjerner; i++) {
        System.out.print("*");
    }
}
