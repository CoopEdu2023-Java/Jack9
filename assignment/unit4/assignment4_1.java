package assignment.unit4;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class assignment4_1 {
    private static final Logger logger = Logger.getLogger(assignment4_1.class.getName());

    public static void main(String[] args) {
        try {
            // 创建文件处理器
            FileHandler fileHandler = new FileHandler("app.log", true); // true 表示追加模式
            fileHandler.setFormatter(new SimpleFormatter()); // 设置格式
            logger.addHandler(fileHandler);
            
            // 记录日志
            logger.info("这是信息日志");
            logger.warning("这是警告日志");
            logger.severe("这是严重日志");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 移除文件处理器
            for (var handler : logger.getHandlers()) {
                handler.close();
            }
        }
    }
}
