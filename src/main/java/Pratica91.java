/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica91 {
    public static void main(String[] args) {
        
        String os = System.getProperty("os.name");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Nome do SO: " +os);
        System.out.println("Numero de processadores:%d\n" + rt.availableProcessors());
        System.out.println("Numero total de memoria em MB: " + rt.totalMemory()/1024/1024);
        System.out.println("Numero total de memoria livre em MB: " + rt.freeMemory()/1024/1024);
        System.out.println("Numero total de memoria utilizada em MB: " + rt.maxMemory()/1024/1024);
    }
}
