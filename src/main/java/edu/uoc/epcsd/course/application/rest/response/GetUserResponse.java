package edu.uoc.epcsd.course.application.rest.response;

import edu.uoc.epcsd.course.domain.User;
import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public final class GetUserResponse {

    private Long id;

    private String fullName;

    private String email;

    private String phoneNumber;

    public static GetUserResponse fromDomain(User user) {
        return GetUserResponse.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
