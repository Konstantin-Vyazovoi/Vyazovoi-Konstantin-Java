
public class HelloAlg {

    public static String getGreeting(String text) {
        return switch (text) {
            case "7" -> "Привет";
            case "Вячеслав" -> "Привет, Вячеслав";
            default -> "Нет такого имени";
        };
    }

}
