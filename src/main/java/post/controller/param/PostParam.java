package post.controller.param;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PostParam {
    @NotBlank(message = "Post should not be null.")
    private String posterName;
    private String postContent;
}
