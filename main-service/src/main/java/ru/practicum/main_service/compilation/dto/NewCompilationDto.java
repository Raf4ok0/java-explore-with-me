package ru.practicum.main_service.compilation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.main_service.MainCommonUtils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewCompilationDto {
    @NotBlank
    @Size(min = MainCommonUtils.MIN_LENGTH_TITLE, max = MainCommonUtils.MAX_LENGTH_TITLE)
    private String title;

    private Boolean pinned = false;
    private List<Long> events = new ArrayList<>();
}
