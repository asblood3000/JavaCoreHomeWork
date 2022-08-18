package Lesson5;

import java.util.List;

public class AppData2 {

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    private List<List<String>> data;

    @Override
    public String toString() {
        return "AppData{" +
                " data=" + data.toString() +
                '}';
    }
}
