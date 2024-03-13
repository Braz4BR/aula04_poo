
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Aluno davi = new Aluno("davi","12345", 1234, "27/032/2005", "masculino");
        davi.setNome("davi");

        System.out.println(davi.getNome());

        Aluno a = new Aluno();
        a.setNome("chico");
        System.out.println(a.getNome());

        System.out.println(davi.getNome());
        System.out.println(davi.getRa());
    }
}