package gr.kmandalas.service.otp.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class NotificationRequestForm {

    @NotEmpty
    private String channel;
    private String destination;
    private String message;

}
