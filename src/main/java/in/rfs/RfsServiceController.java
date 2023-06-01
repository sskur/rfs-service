package in.rfs;

import io.micronaut.http.annotation.*;

@Controller("/rfsService")
public class RfsServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}