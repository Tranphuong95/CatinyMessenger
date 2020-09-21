package org.regitiny.catiny.messenger.domain.key;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MessageSimpleByRecipientKey
{
  @NotNull
  @PrimaryKeyColumn(name = "recipientId", type = PrimaryKeyType.PARTITIONED)
  protected UUID recipientId;

  @NotNull
  @PrimaryKeyColumn(name = "topicId", ordinal = 0)
  protected UUID topicId;
}
