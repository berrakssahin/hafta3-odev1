public class Customer
{
    public Customer()
    {
        System.out.println("Müşteri nesnesi başlatıldı");
    }

    public int Id;
    public String City;

    Customer(String city, int id)
    {
        this.City= city;
        this.Id= id;
    }

    public int getId()
    {
        return this.Id;
    }
    public void setId()
    {
        this.setId();
    }
}

