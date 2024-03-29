package uaic.fii.main.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uaic.fii.main.model.RequestInputDto;
import uaic.fii.main.model.ResourceDiffDto;
import uaic.fii.main.model.ResourceDto;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @GetMapping("/resources")
    @Operation(description = "This will return all the resources for the given request")
    @Parameter(in = ParameterIn.HEADER,
                description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
                name = "Authorization",
                required = true,
                content = @Content(schema = @Schema(type = "string")))
    public List<ResourceDto> getResources(@RequestBody RequestInputDto requestInputDto) {
        return new ArrayList<>();
    }

    @PostMapping("/diff")
    @Operation(description = "This will compare the given DTOs and return all the differences between them")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public ResourceDiffDto diffResources(@RequestBody List<ResourceDto> resourceDtos) {
        return new ResourceDiffDto();
    }
}
