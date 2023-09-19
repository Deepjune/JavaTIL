import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class LocalWebServer {

    public static void main(String[] args) throws IOException {
        // HTTP 서버 생성
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // 루트 경로 핸들러 등록
        server.createContext("/", new RootHandler());

        // 서버 시작
        server.start();

        System.out.println("로컬 웹 서버가 실행 중입니다. http://localhost:8000/");
    }

    static class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response.getBytes());
            outputStream.close();
        }
    }
}
