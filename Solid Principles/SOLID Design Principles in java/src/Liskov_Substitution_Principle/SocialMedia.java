package Liskov_Substitution_Principle;

public abstract class SocialMedia {

    //@support Whatsapp, Facebook, Instagram
    public abstract void chatWithFriend();

    //@support Facebook, Instagram
    public abstract void publishPost(Object post);

    //@support Whatsapp, Facebook, Instagram
    public abstract void sendPhotosAndVideo();

    //@support WhatsApp, Facebook
    public abstract void groupVideoCall(String... users);
}
