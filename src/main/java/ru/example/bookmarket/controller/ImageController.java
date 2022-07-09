package ru.example.bookmarket.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.example.bookmarket.model.Image;

import java.util.List;

@RequestMapping(value = "/images")
@RestController
@Tag(name = "Image controller", description = "add and get images")
public interface ImageController {
    @Operation(summary = "Save images")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Save",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not available",
                    content = @Content)
    })

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    List<Image> save(@RequestBody() List<MultipartFile> files);

    @GetMapping("/{id}")
    Image findById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id);
}
