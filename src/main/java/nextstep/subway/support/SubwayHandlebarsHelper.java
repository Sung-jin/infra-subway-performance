package nextstep.subway.support;

import com.github.jknack.handlebars.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SubwayHandlebarsHelper {
    private static final Logger logger = LoggerFactory.getLogger(SubwayHandlebarsHelper.class);

    @Autowired
    private SubwayVersion subwayVersion;

    public String staticUrls(String path, Options options) {
        return String.format("/resources/%s%s", subwayVersion.getVersion(), path);
    }
}