package aula05b;

public class aula05 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Guilherme Carvalho", 10, 'M');
        Pessoa p2 = new Pessoa("Nuno Martins", 13, 'M');
        Pessoa p3 = new Pessoa("Nuno Carvalho", 39, 'M');
        Pessoa p4 = new Pessoa("Odete Ribeiro", 76, 'F');
        
        ContaBanco cb1 = new ContaBanco(p1);
        cb1.abrirConta("CJ");
        cb1.extratoConta();
        cb1.pedirEmprestimo(50000);
        
        ContaBanco cb2 = new ContaBanco(p3);
        cb2.abrirConta("CC");
        cb2.extratoConta();
        
        cb2.transferir(50, cb1);
    }
}
