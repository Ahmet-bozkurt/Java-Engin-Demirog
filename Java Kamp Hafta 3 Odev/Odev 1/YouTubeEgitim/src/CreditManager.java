public class CreditManager {
    interface ICreditManager{
        void Calculate();
        void Save();
    }

    public void hesapla(){
        System.out.println("Hesapland─▒");
    }
    public void Save(){
        System.out.println("Kaydedildi.");
    }

}
