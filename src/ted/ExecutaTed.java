package ted;

import ted.cliente.Cliente;
import ted.funcionario.Funcionario;

public class ExecutaTed {
    public static void main(String[] args) {

       Cliente c1 = new Cliente("Mateus", "22/05/1998", "Rua Saffa Said Abel da Cunha",
               58042220, "996673467", 83, "01","Medico");
       System.out.println(c1.toString());

        Funcionario f1 = new Funcionario("Lucas","18/02/2000","Rua Fulano de Tal",
                78511133,"988453266",011,514395,2300.99,"25/05/2023","Gerente");
        System.out.println(f1.toString());
    }
}
