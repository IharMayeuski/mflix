package mflix.api.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.bson.codecs.pojo.annotations.BsonProperty;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Session {

    @BsonProperty(value = "user_id")
    private String userId;
    private String jwt;
}
