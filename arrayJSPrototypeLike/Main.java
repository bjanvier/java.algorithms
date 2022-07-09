package arrayJSPrototypeLike;

public class Main {

    public static void main(String[] args) {
        ArrayJSPrototypeLike<String> obj = new ArrayJSPrototypeLike<>();

        try {
            obj.push("a");
            obj.push("b");
            obj.push("w");
            obj.push("X");
            obj.push("y");
            obj.push("z");
            // obj.delete(3);

            obj.splice(2, 900, "c", "d", "e", "f");

            for (int i = 0; i <= obj.size(); i++) {
                System.out.println(obj.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
