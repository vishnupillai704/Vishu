public class Assignment1Customerclass {
    private Assignment1Addressclass addressclass;
    private Integer customerId;
    private String customerName;
    private Integer customerContact;
    private String customerAddress;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(Integer customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }



    public Assignment1Addressclass getAddressclass() {
        return addressclass;
    }

    public void setAddressclass(Assignment1Addressclass addressclass) {
        this.addressclass = addressclass;
    }
    public void Details(){
        System.out.println("Customer id :"+getCustomerId()+" CustomerName : "+getCustomerName()+" CustomerContact: "+customerContact+" CustomerAddress : "+getCustomerAddress()+" "+addressclass.getCountry()+" "+addressclass.getState()+" "+addressclass.getCity()+" "+addressclass.getStreet()+" "+addressclass.getZip());
    }
}
