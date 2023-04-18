package Lesson5;

public class HW5 {

    public static final String PATH = "src/main/java/Lesson5/test.csv";
    public static final String OTHER_PATH = "src/main/java/Lesson5/newtest.csv";

    public static void main(String[] args) {
        String[] headers = {"Value_1", "Value_2", "Value_3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(headers, data);

        String[] otherHeaders = {"First", "Second", "Third"};
        int[][] otherData = {
                { 0, 1, 2 },
                { 8, 5, 4 }
        };
        AppData otherAppData = new AppData(otherHeaders, otherData);

        appData.writeToFile(PATH);
        AppData receivedAppData = AppData.readFromFile(PATH);
        System.out.println(receivedAppData);

        AppData receivedFromOtherPathAppData = AppData.readFromFile(OTHER_PATH);
        System.out.println(receivedFromOtherPathAppData);

    }

}
