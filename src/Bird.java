public interface Bird {
    default void up(){
        System.out.println("Bird is up");
    }
    default void down(){
        System.out.println("Bird is down");
    }
}
