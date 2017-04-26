package aula05b;

public class ContaBanco {
    // Atributos
    public int numConta = 0;
    protected String tipo;
    private Pessoa dono;
    private float saldo;
    private float emprestimo = 0;
    private boolean status;
    
    // Métodos
    public void extratoConta() {
        if (this.getDono() != null && this.getNumConta() != 0) {
            System.out.println("------- EXTRATO -------");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Dono: " + this.getDono().getNome());
            System.out.println("Tipo: " + this.getTipo());
            if (this.getSaldo() > 0 && this.getEmprestimo() == 0) {
                System.out.println("Saldo atual: " + this.getSaldo() + "€");
            }
            else if (this.getSaldo() < 0 && this.getEmprestimo() == 0) {
                System.out.println("Saldo atual: " + this.getSaldo() + "€ [SALDO NEGATIVO]");
            }
            else if (this.getSaldo() > 0 && this.getEmprestimo() != 0) {
                System.out.println("Saldo atual (+ empréstimo): " + this.getSaldo() + "€ (" + this.getEmprestimo() + "€)");
            }
            if (this.getEmprestimo() > 0) {
                System.out.println("Empréstimos: Sim (" + this.getEmprestimo() + "€)");
            }
            else {
                System.out.println("Empréstimos: Não");
            }
            if (this.getStatus()) {
                System.out.println("Aberta: Sim");
            }
            else {
                System.out.println("Aberta: Não");
            }
            System.out.println("-----------------------");
        }
        else if (this.getDono() != null) {
            System.out.println("Você não tem uma conta ativa");
        }
    }
    
    public void abrirConta(String t) {
        if (this.getStatus() == false) {
            if (this.getDono().getIdade() >= 18 && this.getDono().getIdade() < 75) {
                int nrConta = (int) (1000 + Math.random() * (10000 - 1000));
                this.setNumConta(nrConta);
                this.setStatus(true);
                if (t.equals("CC")) {
                    this.setSaldo(50);
                    this.setTipo(t);
                }
                else if (t.equals("CP")) {
                    this.setSaldo(150);
                    this.setTipo(t);
                }
                else if (t.equals("CJ")) {
                    System.out.println("Erro ao abrir a conta: você não pode ter uma Conta Júnior");
                }
                if (this.getDono().getSexo() == 'M') {
                    System.out.println("Conta aberta com sucesso, Sr. " + this.getDono().getNome());
                }
                else {
                    System.out.println("Conta aberta com sucesso, Srª. " + this.getDono().getNome());
                }
            }
            else if (this.getDono().getIdade() < 18 && t.equals("CJ")) { // Conta Júnior
                int nrConta = (int) (1000 + Math.random() * (10000 - 1000));
                this.setNumConta(nrConta);
                this.setTipo(t);
                this.setStatus(true);
                this.setSaldo(25);
                System.out.println("Conta aberta com sucesso, Sr. " + this.getDono().getNome());
            }
            else if (this.getDono().getIdade() >= 75) {
                System.out.println("Erro ao abrir a conta: você é velho demais!");
            }
            else if (this.getDono().getIdade() < 18 && !(t.equals("CJ"))) {
                System.out.println("Erro ao abrir a conta: você só pode ter uma Conta Júnior (CJ)");
            }
        }
        else {
            System.out.println("Erro ao abrir a conta: já foi aberta!");
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada: ainda tem dinheiro.");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada: está em débito.");
        }
        else {
            this.setStatus(false);
            if (this.getDono().getSexo() == 'M') {
                System.out.println("Conta fechada com sucesso, Sr. " + this.getDono().getNome());
            }
            else {
                System.out.println("Conta fechada com sucesso, Srª. " + this.getDono().getNome());
            }
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito no valor de " + v + "€ na conta de " + this.getDono().getNome() + " realizado com sucesso!");
        }
        else {
            System.out.println("Impossível depositar: conta fechada");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (!(this.getTipo().equals("CJ"))) {
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque no valor de " + v + "€ na conta de " + this.getDono().getNome() + " realizado com sucesso!");
                }
                else {
                    System.out.println("Impossível sacar: saldo insuficiente");
                }
            }
            else {
                System.out.println("Impossível sacar: Impossível sacar na Conta Júnior!");
            }
        }
        else {
            System.out.println("Impossível sacar: conta fechada");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        // Saber o valor a pagar
        if (this.getTipo().equals("CC")) {
            v = 12;
        }
        else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade no valor de " + v + "€ da conta de " + this.getDono().getNome() + " paga com sucesso!");
            }
            else {
                System.out.println("Impossível pagar mensalidade: Saldo Insuficiente!");
            }
        }
        else {
            System.out.println("Impossível pagar mensalidade: conta fechada!");
        }
    }
    
    public void transferir(float v, ContaBanco cb) {
        if (this.getStatus()) {
            if (this.getTipo().equals("CJ")) {
                System.out.println("Impossível transferir: Conta Júnior impossibilitada de transferir dinheiro!");
            }
            else if (this.getTipo().equals(cb.getTipo())) {
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - v);
                    cb.setSaldo(cb.getSaldo() + v);
                    System.out.println("Tranferência do valor " + v + "€ da conta de " + this.getDono().getNome() + " para " + cb.getDono().getNome() + " realizada com sucesso!");
                }
                else {
                    System.out.println("Impossível transferir: Saldo Insuficiente!");
                }
            }
            else if (cb.getTipo().equals("CJ")) {
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - v);
                    cb.setSaldo(cb.getSaldo() + v);
                    System.out.println("Tranferência do valor " + v + "€ da conta de " + this.getDono().getNome() + " para " + cb.getDono().getNome() + " (Conta Júnior) realizada com sucesso!");
                }
                else {
                    System.out.println("Impossível transferir: Saldo Insuficiente!");
                }
            }
            else {
                System.out.println("Impossível transferir: Tipos incompatíveis (" + this.getTipo() + " e " + cb.getTipo() + ")");
            }
        }
        else {
            System.out.println("Impossível transferir: Conta Inativa");
        }
    }
    
    public void pedirEmprestimo(float v) {
        if (this.getStatus()) {
            if (!(this.getTipo().equals("CJ"))) {
                if (this.getSaldo() > 0 || this.emprestimo == 0) {
                    float juros = v / 10;
                    float total = v + juros;
                    System.out.println("Valor do Empréstimo + Juros: " + v + "€ + " + juros + "€ (10%) = " + total);
                    this.setEmprestimo(total);
                    this.setSaldo(this.getSaldo() + getEmprestimo());
                    System.out.println("Pedido de Empréstimo feito por " + this.getDono().getNome() + ", no valor de " + total + " (com juros) realizado com sucesso!");
                }
                else if (this.getEmprestimo() != 0) {
                    System.out.println("Impossível pedir empréstimo: Empréstimo a decorrer (" + this.getEmprestimo() + " restantes em dívidas)");
                }
                else if (this.getSaldo() < 0) {
                    System.out.println("Impossível pedir empréstimo: Conta em débito!");
                }
            }
            else if (this.getTipo().equals("CJ")) {
                System.out.println("Impossível pedir empréstimo: Conta Júnior não pode pedir empréstimos!");
            }
        }
        else {
            System.out.println("Impossível pedir empréstimo: Conta Inativa!");
        }
    }
    
    public void pagarEmprestimo (float v) {
        if (this.getStatus()) {
            if (this.getEmprestimo() > 0) {
                System.out.println("Valor a pagar: " + v + "€");
                if (v == this.getEmprestimo()) {
                    System.out.println("Pagamento da totalidade empréstimo feito por " + this.getDono().getNome() + " feito com sucesso!");
                }
                else {
                    System.out.println("Pagamento de " + v + "€ do empréstimo feito por " + this.getDono().getNome() + " feito com sucesso! (Quantia pendente: " + this.getEmprestimo() + "€)");
                }
                this.setEmprestimo(this.getEmprestimo() - v);
                this.setSaldo(this.getSaldo() - v);
            }
            else {
                System.out.println("Impossível pagar empréstimo: Não há empréstimos pendentes!");
            }
        }
        else {
            System.out.println("Impossível pagar empréstimo: Conta Inativa!");
        }
    }
    
    // Construtor
    public ContaBanco(Pessoa d) {
        this.setDono(d);
        this.saldo = 0;
        this.status = false;
    }
    
    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public float getEmprestimo() {
        return this.emprestimo;
    }
    
    public void setEmprestimo(float emprestimo) {
        this.emprestimo = emprestimo;
    }
}