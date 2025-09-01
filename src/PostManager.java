import java.util.*;

public class PostManager {
    public int calculateEngagement(int... interactions) {
        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }

    public String getCategoryRating(int score) {
        if (score >= 1000) return "Viral";
        if (score >= 500) return "Popular";
        if (score >= 100) return "Good";
        if (score >= 50) return "Low";
        return "Poor";
    }

    public void displayPostStats(String title, int score) {
        System.out.println("Post: " + title);
        System.out.println("Engagement Score: " + score);
    }

    public void displayPostStats(String title, int score, String category) {
        System.out.println("Post: " + title);
        System.out.println("Engagement Score: " + score);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> unique = new ArrayList<>();
        for (String tag : hashtags) {
            if (!unique.contains(tag)) {
                unique.add(tag);
            }
        }
        return unique;
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> scores) {
        LinkedList<String> trending = new LinkedList<>();
        for (String post : posts) {
            if (scores.get(post) > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        return new HashSet<>(Arrays.asList(authors));
    }

    public static void main(String[] args) {
        PostManager pm = new PostManager();

        System.out.println("═══ Social Media Post Manager ═══");

        int score = pm.calculateEngagement(150, 75, 25);
        pm.displayPostStats("Java Programming Tips", score, pm.getCategoryRating(score));

        String[] tags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> hashtags = pm.manageHashtags(tags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> postScores = new HashMap<>();
        postScores.put("Advanced Java Tutorial", 800);
        postScores.put("Spring Boot Guide", 1200);

        LinkedList<String> trending = pm.findTrendingPosts(posts, postScores);
        HashSet<String> authors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        System.out.println();
        System.out.println("Unique Hashtags: " + hashtags);
        System.out.println("Trending Posts: " + trending);
        System.out.println("Unique Authors: " + authors);
    }
}