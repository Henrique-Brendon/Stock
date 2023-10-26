package users;

abstract class Person {
    private String name;
    private int age;
    private String dateOfBirth;
    private String email;
    private double cpf;
    private int rg;

    public Person(){

    }

    public  Person(String name, int age, String dateOfBirth, String email, double cpf, int rg){
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;

        this.rg = rg;
    }
    
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getDateOfBirth() {
        return dateOfBirth;
    }

    protected void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected double getCpf() {
        return cpf;
    }

    protected void setCpf(double cpf) {
        this.cpf = cpf;
    }

    protected int getRg() {
        return rg;
    }

    protected void setRg(int rg) {
        this.rg = rg;
    }

    
    @Override
    public String toString() {
        return "Nome: " + name + ", idade " + age + ", data de nascimento " + dateOfBirth + ", email " + email +  " cpf " + cpf + ", rg " + rg;
    }




}