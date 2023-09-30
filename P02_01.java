// 12S23049 - Clarissa Manurung

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsiTugas;
        String kodeMataKuliah;
        String namaMataKuliah;
        String pengampu;
        String deadline;
        String formatPenamaanTugas;

        deskripsiTugas = input.nextLine();
        kodeMataKuliah = input.nextLine();
        namaMataKuliah = input.nextLine();
        pengampu = input.nextLine();
        deadline = input.nextLine();
        formatPenamaanTugas = input.nextLine();
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + namaMataKuliah + "|" + pengampu + "|" + deadline + "|" + formatPenamaanTugas);
    }
}
