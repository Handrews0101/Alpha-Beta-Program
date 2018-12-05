public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer(String name, String audioSpecification) {

    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
  }


  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }


  public String toString() {

    String printString = super.toString();

    printString += "\nAudio Spec : " + audioSpecification + "\n" +
        "Type : " + mediaType;
    return printString;
  }

}
