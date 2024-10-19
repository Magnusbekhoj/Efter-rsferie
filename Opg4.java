public static void main(String[] args) {
    // metoden, der udskriver en linje med 20 stjerner
    stjerneLinje();
}

// Metode der udskriver en linje med præcis 20 stjerner ved hjælp af en lokal variabel
public static void stjerneLinje() {
    int antalStjerner = 20;  // Lokal variabel sat til 20
    for (int i = 0; i < antalStjerner; i++) {
        System.out.print("*");  // Udskriv en stjerne uden linjeskift
    }
}