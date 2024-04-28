package org.example.codingTasks;

public class Registration {

    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if (email.endsWith("@yahoo.com")){
            this.email=email;
        }else {
            System.out.println("Invalid Email");
        }
    }
    public void setUserName(String userName){
        if (userName!=null && !userName.isEmpty() && userName.length()>6){
            this.userName=userName;
        }else {
            System.out.println("Invalid Username");
        }
    }
    public void setPassword(String password){
        if (password!=null && !password.isEmpty() && password.length()>6){
            this.password=password;
        }else {
            System.out.println("Invalid password");
        }
    }
    public void displayUserDetails(){
        System.out.println("User details: ");
        System.out.println("Email: "+email);
        System.out.println("Username: "+userName);
        System.out.println("Password: "+password);
    }
}

class RegistrationTester{
    public static void main(String[] args) {
        Registration user=new Registration();
        user.setEmail("abc@yahoo.com");
        user.setUserName("Abcabcd");
        user.setPassword("abcabcd");
        user.displayUserDetails();

    }
}
