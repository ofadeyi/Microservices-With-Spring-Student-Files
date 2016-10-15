package io.luminara.uservices.scnoss;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by ofadeyi.
 */
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
