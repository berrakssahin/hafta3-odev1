public abstract class BaseCreditManager implements ICreditManager {
    //abstractlar ortak operasyonlarÄ± tutar
    //virtual=sanal
    public abstract void Calculate();
    public /*virtual */ void Save()
    {
        System.out.println("Kaydedildi");
    }
}
