public class Main2 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("0535496");
        mobilePhone.addNewContatct(new Contact("Ali", "535"));
        mobilePhone.addNewContatct(new Contact("Ali", "535"));
        Contact contact1 = new Contact("Elif", "536");
        mobilePhone.addNewContatct(contact1);
        mobilePhone.printContact();
        mobilePhone.removeContact(contact1);
        mobilePhone.printContact();
        Contact contact2 = new Contact("Beyza", "538");
        mobilePhone.addNewContatct(contact2);
        mobilePhone.printContact();
        mobilePhone.addUpdateContact(contact2, new Contact("Beyza", "539"));
        mobilePhone.printContact();
        System.out.println("Beyza's line: " + mobilePhone.findContact(contact2));
        System.out.println(mobilePhone.queryContact("Beyza"));

    }
}
