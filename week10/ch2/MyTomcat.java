import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 赵好运
 * @version 1.0
 * 自己写的一个Web服务，可以返回hello.html给浏览器
 **/
public class MyTomcat {
    public static void main(String[] args) throws IOException {
        //1.在9999端口监听
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("web服务在9999端口监听");
        while (!serverSocket.isClosed()) {
            //2.等待浏览器/客户端连接
            Socket socket = serverSocket.accept();//该socket用于通信
            //3.通过socket得到输出流
            OutputStream outputStream = socket.getOutputStream();
            //4.读取html文件返回即可
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("src/hello.html"));//字符输入流
            String buf = "";
            while ((buf = bufferedReader.readLine()) != null) {
                outputStream.write(buf.getBytes());
            }
            //outputStream.write("hello I am Tomcat".getBytes());//返回给浏览器/客户端

            outputStream.close();
            socket.close();
        }
            serverSocket.close();

    }
}
