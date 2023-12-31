package com.maljaaa.commerce.dto;

import com.maljaaa.commerce.model.Member;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberResponseDto {

    private String name;

    public static MemberResponseDto of(Member member) {
        return new MemberResponseDto(member.getEmail());
    }
}
