package com.example.lab11.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "post id should not be empty")
    @Column(columnDefinition = "int not null")
    private Integer post_id;
    @NotNull(message = "author id should not be empty")
    @Column(columnDefinition = "int not null")
    private Integer author_id;
    @NotEmpty(message = "content should not be empty")
    @Column(columnDefinition = "varchar(255) not null")
    private String content;
    @NotNull(message = "publication date should not be empty")
    private Date comment_date;
}
