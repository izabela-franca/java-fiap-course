package exercicios;

public class ExCache {

    public static void main(String[] args) {

        Cache cache = new Cache();
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));

        System.out.println(cache.get("apartment"));
    }
}
