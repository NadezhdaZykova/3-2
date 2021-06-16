package manager;

import domain.Post;

public class PostManager {
    private Post[] posts;
    int ownerID;
    String domain;
    String query;
    boolean ownersOnly;
    int count;
    int offset;
    int postId;

    public Post[] search(int count, Post[] posts ) {
        Post[] posts = postManager.getPostsForFeed();

        return null;
    }

    public void delete(int ownerID, int post_id)

    {
        int postId;

    }
}