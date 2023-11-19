package dw.com.projectmanager.dto;

import dw.com.projectmanager.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private Long id;
    private Long projectId;
    private Long personId;

    public static MemberDTO mapFromMember(Member member) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(member.getId());
        memberDTO.setPersonId(member.getId());
        memberDTO.setProjectId(member.getProject().getId());
        return memberDTO;
    }


}

