package lab5;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public class FileSender {

	AtomicInteger stats = new AtomicInteger(0);

	public void send(String path) {
		sendFile(new File(path));
		stats.incrementAndGet();
	}

	public int getStats() {
		return stats.getAndSet(0);
	}

	private void sendFile(File f) {
		stats.decrementAndGet();
		System.out.println("new file " + f.getName());
		// TODO send file
	}

}