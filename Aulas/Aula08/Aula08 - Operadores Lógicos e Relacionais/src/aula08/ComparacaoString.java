package aula08;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Nuno";
        String nome2 = "Nuno";
        String nome3 = new String("Nuno");
        String res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
}
