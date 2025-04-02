import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonex1 {
    private static final String FILE_NAME = "route.json";

    public static void main(String[] args) {
        // 샘플 데이터
        int[] bestRoute = {0, 2, 3, 1};
        String[] locations = {"A", "B", "C", "D"};

        // JSON 객체 생성
        JSONObject json = new JSONObject();
        JSONArray routeArray = new JSONArray();

        for (int index : bestRoute) {
            if (index >= 0 && index < locations.length) {
                routeArray.put(locations[index]);
            }
        }
        json.put("route", routeArray);

        // JSON 파일 저장
        try {
            Files.write(Paths.get(FILE_NAME), json.toString(4).getBytes());
            System.out.println("JSON 저장 완료: " + new File(FILE_NAME).getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
