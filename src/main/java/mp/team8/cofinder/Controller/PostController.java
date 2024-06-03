package mp.team8.cofinder.Controller;

import mp.team8.cofinder.Entity.Post;
import mp.team8.cofinder.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post newPost = postService.createPost(post);
        return ResponseEntity.ok(newPost);
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<List<Post>> getPostsByTeam(@PathVariable Long teamId) {
        List<Post> posts = postService.getPostsByTeam(teamId);
        return ResponseEntity.ok(posts);
    }
}
