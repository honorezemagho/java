public class CheckPrivileges {
    public  CheckPrivileges(String role){

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're an admin");
                break;
        
            default:
                System.out.println("You're an admin");
                break;
        }
    }
}
