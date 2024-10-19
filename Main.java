public static void main(String[] args) {
    // Kald de forskellige varianter af stjerneudskrifter
    stjerneLinje();          // Opgave 4 - Udskriver præcis 20 stjerner
    stjerneLinje(15);        // Opgave 5 - Udskriver 15 stjerner
    tegnLinje(10, '#');      // Opgave 6 - Udskriver 10 gange '#'
}

// Opgave 4: Udskriver præcis 20 stjerner ved at kalde den generelle tegn-metode
public static void stjerneLinje() {
    tegnLinje(20, '*');  // Udskriver 20 stjerner
}

// Opgave 5: Udskriver et variabelt antal stjerner ved at kalde den generelle tegn-metode
public static void stjerneLinje(int antalStjerner) {
    tegnLinje(antalStjerner, '*');
}

// Opgave 6: Generel metode til at udskrive et hvilket som helst tegn et givet antal gange
public static void tegnLinje(int antal, char tegn) {
    for (int i = 0; i < antal; i++) {
        System.out.print(tegn);
    }
    System.out.println();  // Skift linje efter at have udskrevet alle tegn
}
