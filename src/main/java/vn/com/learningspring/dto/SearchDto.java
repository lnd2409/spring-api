package vn.com.learningspring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDto {
    private Long page;
    private Long size;
    private String sort;
}
