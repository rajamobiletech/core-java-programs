public class PasswordService {

    public String getPassword(String userName) throws IllegalArgumentException{
        if(userName.equals("raja")) {
            return "password@123";
        } else {
            throw  new IllegalArgumentException("Invalidate Username");
        }
    }
}
