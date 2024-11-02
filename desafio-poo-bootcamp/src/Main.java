public class Main {
    public static void main(String[] args) throws Exception {

        // ===== Exemplo de funcionamento ===================================================================

        // ===== Declaração dos devs ========================================================================
        
        Developer devViniss = new Developer("srSenhor");
        Developer devCarla = new Developer("carlinhasurfista");

        // ===== Declaração dos conteúdos ===================================================================

        Content javaBasicCourse = new Course("Curso Java Basico", "Bases do Java", 20);
        Content javaPooCourse = new Course("Curso POO com Java", "POO e java <3", 12);
        Content camilaMentorship = new Mentorship("Mentoria sobre Java", "Mentoria com a Camila");
        Content aiMentorship = new Mentorship("Mentoria sobre IA", "Conversando sobre IA");

        // ===== Declaração do bootcamp e inscrição dos devs ================================================

        Bootcamp javaBootcamp = new Bootcamp(
            "Claro - Java com Spring Boot",
            "Construindo o futuro com Java e Spring",
            65
        );

        javaBootcamp.addContent(javaBasicCourse);
        javaBootcamp.addContent(javaPooCourse);
        javaBootcamp.addContent(camilaMentorship);
        javaBootcamp.addContent(aiMentorship);
        
        devViniss.subscribeOnBootcamp(javaBootcamp);
        devCarla.subscribeOnBootcamp(javaBootcamp);

        // ===== Exibindo informações do bootcamp ===========================================================
        
        javaBootcamp.getInfo();
        
        // ===== Exibindo informações dos devs ==============================================================

        devViniss.progress();
        devViniss.progress();
        devCarla.progress();

        devViniss.showProfile();
        devCarla.showProfile();



    }
}
