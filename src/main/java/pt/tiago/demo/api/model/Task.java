package pt.tiago.demo.api.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Task  {
    @NonNull private int id;
    @NonNull private String name;

}
