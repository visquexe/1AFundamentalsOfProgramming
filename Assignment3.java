public class assignment {
    public static void main(String[] args) {
        // String data type used for text/characters like names and addresses
        String firstname = "James"; // stores the first name
        String lastname = "Lebantino"; // stores the last name
        String address = "Ungab Cuyapo Nueva Ecija"; // stores the address

        // String is used for mobile number instead of int because numbers 
        // with a leading zero and no arithmetic use are better stored as text
        String mobileNumber = "09302918915"; // 09302918915

        // int is used for age since it's a whole number with no decimal value
        int age = 18; // stores the age

        // double is used for GWA since it holds a decimal value
        double gwa = 94.21; // stores the general weighted average

        // Display the output
        System.out.println("Firstname: " + firstname); // print first name
        System.out.println("Lastname: " + lastname); // print last name
        System.out.println("Address: " + address); // print address
        System.out.println("Mobile Number: " + mobileNumber); // print mobile number
        System.out.println("Age: " + age); // print age
        System.out.println("GWA: " + gwa); // print GWA
    }
}
