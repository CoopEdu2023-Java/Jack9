import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat.Field;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;



public class assignment4_4 {

    public static void extract(String jarPath) throws Exception {
        JarFile jarFile = new JarFile(jarPath);
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            if (entry.getName().endsWith(".class")) {
                Path filePath = Paths.get(entry.getName());
                InputStream inputStream = jarFile.getInputStream(entry);
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            }
        }
        jarFile.close();
    }
    public static void main(String[] args) throws Exception {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> mainClass = Class.forName("assignment.unit4.GuessingGame");
        Object instance = mainClass.getDeclaredConstructor().newInstance();
        Method mainMethod = mainClass.getMethod("main", String[]);

        new Thread(() -> {
            try {
                mainMethod.invoke(instance, (Object) new String[] {});
            } catch (Exception e) {
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(100);
                java.lang.reflect.Field field = instance.getClass().getDeclaredField("secretNumber");
                field.setAccessible(true);
                System.out.println("Cracked: " + field.get(mainMethod));
            } catch (Exception e) {
            }
        }).start();
    }
}