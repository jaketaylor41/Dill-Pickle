import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
      staticFileLocation("/public");

      get("/", (request, response) -> {
          response.redirect("/index.html");
          return null;
      });
      get("/popcorn", (request, response) -> {
          response.type("application/json");
          return "{\n" +
                  "  \"people\" : [\n" +
                  "    {\"name\" : \"Zech\", \"city\" : \"Zech walked me through each step and explained things that were confusing to me.\"},\n" +
                  "    {\"name\" : \"Jake\", \"city\" : \"Shout out to Jake for working out our group challenge on the timer project.\"},\n" +
                  "    {\"name\" : \"Kym\", \"city\" : \"Kym was helpful and patient.\"},\n" +
                  "    {\"name\" : \"Joan\", \"city\" : \"Joan helped me better understand the mini challenge.\"},\n" +
                  "    {\"name\" : \"Lori\", \"city\" : \"I think Lori is thinking like a programmer and asking great questions\"},\n" +
                  "    {\"name\" : \"Manny\", \"city\" : \"Santa Manny his patience and explanations helped me process the peer challenge\"},\n" +
                  "    {\"name\" : \"Ted\", \"city\" : \"Ted helped me to better understand my weekend challenge.\"},\n" +
                  "    {\"name\" : \"Scott\", \"city\" : \"I like how you explain code.\"},\n" +
                  "    {\"name\" : \"Mark\", \"city\" : \"Shout out to Mark! He's a great partner to work with.\"},\n" +
                  "    {\"name\" : \"Koddie\", \"city\" : \"Thanks to Koddie for the new snacks!\"}\n" +
                  "\n" +
                  "  ]\n" +
                  "}";
      });
    }
}
