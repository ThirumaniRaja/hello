package Activity;

public class ActivityOne {

    public static void main(String[] args){
        var note = """
                Vanakam makkale
                King maker kamarajar 
                Tamil valga
                                    Thirumani
                """;
        var myDeveloper = new Developer("Thiru",786,note);
        var badge = new GoldBadge();
        System.out.println(myDeveloper.name() +"-"+ badge.type());
    }
    /*
    *
    *  Tasks
        • Replace the Developer class with a record that models name, id, and note.
        • Store the developer’s note as a text block with two lines: greeting and reminder.
        • Use var wherever the initializer makes the type obvious.
        • Redesign Badge as a sealed interface with exactly two permitted types: GoldBadge and SilverBadge.
        • Identify one feature that improves readability but could limit flexibility, and explain why.
    * */
}
