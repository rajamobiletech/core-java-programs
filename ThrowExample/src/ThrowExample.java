public class ThrowExample {
    public static void main(String[] args) {
            AuthenticationService authenticationService = new AuthenticationService();
        try {
            String password = authenticationService.validateUserName("hghyg");
            boolean isValidCredential = authenticationService.validateCredentials("raja", password);
            if (isValidCredential) {
                System.out.println("Successfully validate the user");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("status Code:400");
            System.out.println(e);
        }catch (RuntimeException e) {
            System.out.println("status Code:404");
            System.out.println(e);
        }
    }
}
