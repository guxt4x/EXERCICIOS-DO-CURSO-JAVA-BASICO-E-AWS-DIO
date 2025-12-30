public record Whatsapp (String mensageWhatsapp) implements Comunicator{

    @Override
    public String mensage(String message) {
        return "Enviando por WhatsApp: " + message;
    }
}
