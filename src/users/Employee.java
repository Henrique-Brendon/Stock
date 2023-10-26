package users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import controller.meetCep;
import entities.DoublyLinkedList;

public class Employee extends Person implements meetCep{

    private static DoublyLinkedList<Employee> list = new DoublyLinkedList<>();

    public Employee(){

    }

    private Employee(String name, int age, String dateOfBirth, String email,double cpf, int rg) {
        super(name, age, dateOfBirth, email, cpf, rg);

    }

    @Override
    public String consultCEP(String cep) {
        try {
            URL url = new URL("https://viacep.com.br/ws/" + cep + "/json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if(conn.getResponseCode() !=  200) {
                throw new IOException("Http request failed");
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while((inputLine = br.readLine())!= null){
                response.append(inputLine);
            }
            br.close();

            String responseJson = response.toString();
            return responseJson;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }


    public static void generateEmploye(){
        String[] dateEmploye = new String[3];
        dateEmploye[0] = "04/11/1999";
        dateEmploye[1] = "10/03/1989";
        dateEmploye[2] = "05/12/2004";   
        Employee[] employes = new Employee[3];


        employes[0] = new Employee("Henrique", 22, dateEmploye[0], "henrique@gmail.com", 2346910007.1, 389189443);
            employes[0].consultCEP("45078-512");

        employes[1] = new Employee("Jailson", 34, dateEmploye[1], "jailson@gmail.com", 9108999708.6, 440312024);
            employes[1].consultCEP("59145-550");

        employes[2] =  new Employee("Agnaldo", 17, dateEmploye[2], "agnaldo@gmail.com", 428237960.02, 108826089);
            employes[2].consultCEP("75130-020");
            list.insertEnd(employes[2]);

        for(Employee A : employes){
            list.insertEnd(A);
            
        }
    }

    public static void generateEmployee(int indice){
        System.out.println("Generate Employee: " + list.findElementByIndex(indice));
    }

    
    
}
