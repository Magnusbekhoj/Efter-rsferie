public static void main(String[] args) {
    // Kald metoden med et variabelt antal stjerner
    stjerneLinje(10);  // Udskriver 10 stjerner
    stjerneLinje(5);   // Udskriver 5 stjerner
    stjerneLinje(20);  // Udskriver 20 stjerner
}

// Metode der udskriver en linje med et bestemt antal stjerner givet som parameter
public static void stjerneLinje(int antalStjerner) {
    for (int i = 0; i < antalStjerner; i++) {
        System.out.print("*");  // Udskriv en stjerne uden linjeskift
    }
    System.out.println();  // Skift linje efter at have udskrevet alle stjerner
}
