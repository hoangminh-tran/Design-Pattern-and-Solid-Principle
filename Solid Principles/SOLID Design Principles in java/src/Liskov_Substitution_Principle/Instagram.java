package Liskov_Substitution_Principle;

// WhatsApp can not be substitute for Social Media, it don't follow Liskov Substitution Principle
public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotosAndVideo() {

    }

    @Override
    public void groupVideoCall(String... users) {
        // Not applicable
    }
}
