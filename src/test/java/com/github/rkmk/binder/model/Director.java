package com.github.rkmk.binder.model;

import com.github.rkmk.binder.BindObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Director {
    private Integer directorId;
    private String directorName;
    @BindObject("ad")
    private List<AssistantDirector> assistantDirectors;
}
