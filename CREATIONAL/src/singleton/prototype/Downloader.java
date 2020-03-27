package singleton.prototype;

public class Downloader {
	private static Downloader downloader;

	private Downloader() {
	}
	
	public static Downloader getInstance()
	{
		if(Downloader.downloader==null)
		{
			System.out.println("Lazy instantiation");
			downloader=new Downloader();
		}
	    return Downloader.downloader;
	}
	
	public void doDownload()
	{
		System.out.println("Downloading started");
	}
}
