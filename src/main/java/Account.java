public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        boolean result;
        if (name != null && name.length() >= 3 && name.length() <= 19) {
            result = name.matches("^[A-Za-zА-Яа-яЁё]+ [A-Za-zА-Яа-яЁё]+$");
        } else {
            result = false;
        }
        return result;
    }
}
