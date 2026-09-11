//CS5800 - HOMEWORK 4 - COMPOSITION
//RAJ AHIR - 019330454

public class DriverProgram {
    public static void main(String[] args) {

        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");

        File phalcon = new File(".phalcon");
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");

        Folder app = new Folder("app");

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        sourceFiles.addFile(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(index);

        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        System.out.println("****** FULL STRUCTURE ******");
        phpDemo1.print();

        System.out.println("\n****** AFTER DELETING app ******");
        sourceFiles.removeSubFolder(app);
        phpDemo1.print();

        System.out.println("\n****** AFTER DELETING public ******");
        sourceFiles.removeSubFolder(publicFolder);
        phpDemo1.print();
    }
}