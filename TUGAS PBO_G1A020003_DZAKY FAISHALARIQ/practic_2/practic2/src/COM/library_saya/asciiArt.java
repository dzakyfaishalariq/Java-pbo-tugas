package COM.library_saya;

public class asciiArt {
    // poblem 1
    public void gambar1(char karakter) {
        System.out.println("membuat gambar senyum : ");
        for (int i = 0; i < 8; i++) {
            if (i > 1 && i < 6) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 1 || i == 6) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 7 || i == 2 || i == 5) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 7) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 7 || i == 2 || i == 5) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 7 || i == 3 || i == 4) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i == 1 || i == 6) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i > 1 && i < 6) {
                System.out.print(karakter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void gambar2() {
        // gambar muka kelinci
        System.out.println("gambar kelinci : ");
        System.out.println("  /\\                /\\");
        System.out.println(" /  \\              /  \\");
        System.out.println("/    \\            /    \\");
        System.out.println("\\    /            \\    /");
        System.out.println(" \\  /              \\  /");
        System.out.println("  \\/                \\/");
        System.out.println("   =====================");
        System.out.println("   |                   |");
        System.out.println("   |  ###         ###  |");
        System.out.println("   |  # #         # #  |");
        System.out.println("   |  ###         ###  |");
        System.out.println("   |                   |");
        System.out.println("   |         ##        |");
        System.out.println("   |     #        #    |");
        System.out.println("   |      ########     |");
        System.out.println("   |       ##  ##      |");
        System.out.println("   =====================");
    }
}
