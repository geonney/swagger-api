package com.aljjabaegi.swagger.api.domain.member.record;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 멤버 수정 응답 record
 *
 * @author GEONLEE
 * @since 2024-03-24
 */
@Schema(description = "멤버 수정 응답")
public record MemberModifyResponse(
        @Schema(description = "멤버 ID", example = "geonlee")
        String memberId,
        @Schema(description = "멤버 이름", example = "이건")
        String memberName,
        @Schema(description = "수정 일시", example = "2024-03-24 00:00:00")
        String modifyDate
) {
}