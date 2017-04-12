package aula14;

public class Vetor2 {
    public static void vetor2() {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ano = 2017;
        if (ano % 4 == 0) {
            tot[1] = 29;
        }
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + ". tem " + tot[i] + " dias ao todo");
        }
    }
}
