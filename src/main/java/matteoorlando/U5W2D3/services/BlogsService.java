package matteoorlando.U5W2D3.services;


import matteoorlando.U5W2D3.entities.Blogpost;
import matteoorlando.U5W2D3.exceptions.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogsService {

    private final BlogpostRepository blogpostRepository;

    @Autowired
    public BlogsService(BlogpostRepository blogpostRepository) {
        this.blogpostRepository = blogpostRepository;
    }

    public Blogpost save(Blogpost blogpost) {
        return blogpostRepository.save(blogpost);
    }

    public List<Blogpost> getBlogs() {
        return blogpostRepository.findAll();
    }

    public Blogpost findById(int id) {
        return blogpostRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Blogpost", "id", id));
    }

    public Blogpost findByIdAndUpdate(int id, Blogpost updatedBlogpost) {
        Blogpost existingBlogpost = findById(id);
        existingBlogpost.setCategory(updatedBlogpost.getCategory());
        existingBlogpost.setTitle(updatedBlogpost.getTitle());
        existingBlogpost.setCover(updatedBlogpost.getCover());
        existingBlogpost.setContent(updatedBlogpost.getContent());
        existingBlogpost.setReadingTime(updatedBlogpost.getReadingTime());
        return blogpostRepository.save(existingBlogpost);
    }

    public void findByIdAndDelete(int id) {
        if (!blogpostRepository.existsById(id)) {
            throw new NotFoundException("Blogpost", "id", id);
        }
        blogpostRepository.deleteById(id);
    }
}

