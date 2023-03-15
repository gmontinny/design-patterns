package v1;

import java.util.Date;

public class Teste {
    public static void main(String[] args) throws Exception {
        Resume resumeA = new Resume();
        resumeA.setName("Giovanny");
        resumeA.setBirthday(new Date(94, 0, 1));
        resumeA.setSex("M");
        resumeA.setSchool("UFSC");
        resumeA.setSocialWorkAge("1");
        resumeA.setCompany("CGE");
        resumeA.setWorkDescription("Orgão de Controle");

        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setSocialWorkAge("3");
        resumeB.setCompany("SEFAZ");
        resumeB.setWorkDescription("Orgão de Tributação");

        System.out.println("=====Lista=====");
        resumeA.display();
        System.out.println("=====Lista=====");
        resumeB.display();

        System.out.println("Resultado: " + (resumeA == resumeB));
    }
}
