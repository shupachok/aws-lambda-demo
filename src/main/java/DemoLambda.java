import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class DemoLambda implements RequestHandler<Map<String, String>, String> {

    @Override
    public String handleRequest(Map<String, String> event, Context context) {
        context.getLogger().log("Function is starting...\n");
        
        String name = event.getOrDefault("name", "World");

        return String.format("Hello, %s! Welcome to AWS Lambda.", name);
    }
}