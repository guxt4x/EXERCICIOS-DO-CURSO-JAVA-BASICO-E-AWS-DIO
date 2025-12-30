public record Email (String mensageEmail) implements Comunicator {

    private String mensageEmail() {
        return mensageEmail;
    }

    @Override
    public String mensage(String message) {
        return "";
    }
}
