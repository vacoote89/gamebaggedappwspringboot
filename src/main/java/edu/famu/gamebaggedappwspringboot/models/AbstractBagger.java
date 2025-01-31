package edu.famu.gamebaggedappwspringboot.models;


import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractBagger {
    @DocumentId
    private String email;
    private String uid;
    private String firstName;
    private String lastName;
}
