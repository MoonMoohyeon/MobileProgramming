package mp.team8.cofinder.Service;

import mp.team8.cofinder.Entity.Post;
import mp.team8.cofinder.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> getPostsByTeam(Long teamId) {
        return postRepository.findByTeamId(teamId);
    }
}
