package lab5;

public class StatsService {

	private FileSender sender;

	public StatsService(FileSender sender) {
		this.sender = sender;
	}

	public int getStats() {
		return sender.getStats() / 10;
	}
}