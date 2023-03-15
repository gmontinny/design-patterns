package v3;

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

        System.out.println("=====Lista=====");
        resumeA.display();
        System.out.println("=====Lista=====");
        resumeB.display();

        resumeA.getBirthday().setDate(5);

        System.out.println();
        System.out.println("=====Lista=====");
        resumeA.display();
        System.out.println("=====Lista=====");
        resumeB.display();
    }
}
