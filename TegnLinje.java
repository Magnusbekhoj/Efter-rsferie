public static void main(String[] args) {
    //metoden af det antal tegn
    TegnLinje(10, '#');
}

public static void TegnLinje(int antalTegn, char tegn) {
    for (int i = 0; i < antalTegn; i++) {
        System.out.print(tegn);
    }
}