package lab5;

import java.util.concurrent.Callable;

public class FileWorker implements Callable {

	private FileSender fileSender;
	String path = "C:\\Users\\Gosia\\Desktop\\ss115.jpg";

	public FileWorker(FileSender fileSender, String path) {
		this.fileSender = fileSender;
		this.path = path;
	}

	@Override
	public Void call() throws Exception {
		fileSender.send(path);
		return null;
	}
}