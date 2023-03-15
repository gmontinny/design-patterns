package v2;

import java.util.Date;

public class Resume implements Cloneable {

        private String name;

        private Date birthday;

        private String sex;

        private String school;

        private String socialWorkAge;

        private String company;

        private String workDescription;

        public Resume() {
            System.out.println("Teste de Padrão Prototype");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getSocialWorkAge() {
            return socialWorkAge;
        }

        public void setSocialWorkAge(String socialWorkAge) {
            this.socialWorkAge = socialWorkAge;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getWorkDescription() {
            return workDescription;
        }

        public void setWorkDescription(String workDescription) {
            this.workDescription = workDescription;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            System.out.println("Clonando");
            return super.clone();
        }

        public void display() {
            System.out.println(String.format("Nome: %s", name));
            System.out.println(String.format("Aniversario: %s, Sexo: %s, Escola: %s, Idade: %s", birthday, sex, school, socialWorkAge));
            System.out.println(String.format("Empresa: %s, Descrição do Trabalho: %s", company, workDescription));
        }
}
