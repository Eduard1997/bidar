package uaic.fii.recommendation.model;

import lombok.Data;

import java.util.List;

@Data
public class RecommendationInputDto {
    private List<ResourceDto> currentResources;
    private List<UserInterestDto> userInterests;
    private List<UserSkillDto> userSkills;
}
