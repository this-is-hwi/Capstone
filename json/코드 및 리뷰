# json
## JSON 파일을 통해 컴퓨터(Java) ↔ Android 간 데이터 공유
### 구조 
JSON 데이터 저장 및 Android로 전송
탐색된 최적 경로를 JSON 파일로 변환하여 저장
Android에서 해당 JSON 파일을 불러와 지도에 적용
```java
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

```
### JSON을 선택한 이유

1. 가벼운 데이터 형식으로 빠른 처리 가능

2. Java(Android)와 PC(Java) 간 호환성 높음

3. API 응답이 기본적으로 JSON 형식

4. 인터넷 없이 파일을 직접 공유할 수 있음
