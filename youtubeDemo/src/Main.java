public class Main {
    public static void main(String[] args) {

        //IoC Container
        CustomerManager customerManager= new CustomerManager(new Customer(), (new MilitaryCreditManager()));
        customerManager.GiveCredit();

       // System.console().readLine();
    }


    abstract class BaseCreditManager implements ICreditManager {
        //abstractlar ortak operasyonları tutar
        //virtual=sanal

        public abstract void Calculate();

        public /*virtual*/ void Save()

        {
            System.out.println("Kaydedildi");
        }
    }
}

//SOLID