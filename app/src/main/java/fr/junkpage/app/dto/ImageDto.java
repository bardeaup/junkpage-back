package fr.junkpage.app.dto;

public class ImageDto {
	
	public String url = "http://localhost:8080/api/journal/image?id={1}";

	public ImageDto(String url) {
		this.url = url;
	}
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	
	
}
