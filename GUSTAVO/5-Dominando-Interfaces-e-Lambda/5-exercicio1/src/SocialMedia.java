public record SocialMedia (String notification) implements Comunicator {

    @Override
    public String mensage(String message) {
        return "Enviando por Social Media: " + message;
    }
}
