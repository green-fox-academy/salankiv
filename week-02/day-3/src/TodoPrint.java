public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String firstLine = "My todo:\n";
        String gamesLine = " - Download games\n";
        String diabloLine = "\t - Diablo";

        todoText = firstLine.concat(todoText);
        todoText = todoText.concat(gamesLine);
        todoText = todoText.concat(diabloLine);

        System.out.println(todoText);
    }
}
