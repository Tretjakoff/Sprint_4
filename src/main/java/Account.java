public class Account {
    private final String name;
    private boolean result;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() >= 3 && name.length() <= 19) {
            int index1 = name.indexOf(" ");
            int index2 = name.lastIndexOf(" ");

            if (index1 == index2 && index1 != -1 && index1 != 0) {
                boolean end = name.endsWith(" ");

                if (!end) {
                    result = true;
                }
            }
        } else {
            result = false;
        }
        return result;

    }

}
