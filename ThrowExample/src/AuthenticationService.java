public class AuthenticationService {

    public String validateUserName(String username) throws RuntimeException {
            if(!username.equals("")) {
                PasswordService passwordService = new PasswordService();
                return passwordService.getPassword(username);
            } else {
                throw  new RuntimeException("Username is empty");
            }
    }

    public boolean validateCredentials(String username, String password) {
        if(username.equals("raja") && password.equals("password@123")) {
            return true;
        } else {
            return false;
        }
    }
}
