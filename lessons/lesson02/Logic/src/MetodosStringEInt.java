public class MetodosString {
    public static void main(String[] args) {
        String texto = "Java e uma exelente linguagem de programação";

        int comprimento = texto.length();
        System.out.println(comprimento);

        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());

        System.out.println(texto.contains("Java"));

        String subtitulo  = texto.replace("Java", "PHP");
        System.out.println(subtitulo);

        String substring = texto.substring(0, 4);
        System.out.println(substring);
    }
}
