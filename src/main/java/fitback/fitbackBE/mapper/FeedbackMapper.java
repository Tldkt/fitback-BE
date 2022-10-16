package fitback.fitbackBE.mapper;

import fitback.fitbackBE.apicontroller.feedbackApiController;
import fitback.fitbackBE.domain.Feedback;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
/*mapstruct의 인터페이스로 정의하기 위한 애너테이션, componentModel 애트리뷰트를 통해 bean등록*/
public interface FeedbackMapper {
    Feedback mapCreateRqToFeedBack(feedbackApiController.CreateFeedbackRequest createFbrequest);

    feedbackApiController.CreatedFeedbackResponse mapFbToCreatedRp(Feedback feedback);

    feedbackApiController.PatchedFbResponse mapFbToPatchFbResponse(Feedback feedback);

    Feedback mapPatchFbRqToFeedback(feedbackApiController.PatchFeedbackRequest request);

}
