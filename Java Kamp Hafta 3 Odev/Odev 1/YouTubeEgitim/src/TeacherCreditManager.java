class TeacherCreditManager extends BaseCreditManager implements CreditManager.ICreditManager {

    @Override
    public void Calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }

}