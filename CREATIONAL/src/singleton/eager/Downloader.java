package singleton.eager;

public class Downloader {
	private static Downloader downloader = new Downloader();

	private Downloader() {
	}
	
	public static Downloader getInstance()
	{
		return Downloader.downloader;
	}
	
	public void doDownload()
	{
		System.out.println("Downloading started");
	}
}
