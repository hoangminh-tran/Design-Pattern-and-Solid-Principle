package Liskov_Substitution_Principle;

// WhatsApp can not be substitute for Social Media, it don't follow Liskov Substitution Principle
public class WhatsApp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {
        //Not applicable
    }

    @Override
    public void sendPhotosAndVideo() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
