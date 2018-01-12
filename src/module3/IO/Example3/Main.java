package module3.IO.Example3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("q.txt");
        file.createNewFile();
        System.out.println(file.isFile());//обределяет существует ли файл
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(file.canWrite());
        System.out.println(file.getName());
        //file.renameTo(new File("q.txt"));
        file.setReadOnly();
        System.out.println(file.canWrite());
        // file.delete();
        file.isAbsolute();
    }
}
//    getAbsolutePath() - абсолютный путь файла, начиная с корня системы. В Android корневым элементом является символ слеша (/)
//        canRead() - доступно для чтения
//        canWrite() - доступно для записи
//        exists() - файл существует или нет
//        getName() - возвращает имя файла
//        getParent() - возвращает имя родительского каталога
//        getPath() - путь
//        lastModified() - дата последнего изменения
//        isFile() - объект является файлом, а не каталогом
//        isDirectory - объект является каталогом
//        isAbsolute() - возвращает true, если файл имеет абсолютный путь
//        renameTo(File newPath) - переименовывает файл. В параметре указывается имя нового имени файла. Если переименование прошло неудачно, то возвращается false
//        delete() - удаляет файл. Также можно удалить пустой каталог