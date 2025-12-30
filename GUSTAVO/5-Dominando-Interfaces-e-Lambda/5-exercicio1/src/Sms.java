public record Sms(String mensageSMS) implements Comunicator {

    @Override
    public String mensage(String message) {
        return "Enviando por SMS: " + message;
    }
}
