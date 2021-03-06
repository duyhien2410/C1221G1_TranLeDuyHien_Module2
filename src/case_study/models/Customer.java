package case_study.models;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, String birthDay, String genders, String identityCard, String phoneNumber, String email, String customerType, String address) {
        super(code, name, birthDay, genders, identityCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public  String getInfoCustomToCSV(){
        return this.getCode()+","+this.getName()+","+this.getBirthDay()+","+this.getGenders()+","+this.getIdentityCard()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getCustomerType()+","+this.getAddress();
    }
}
