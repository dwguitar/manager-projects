package dw.com.projectmanager.mapper;

import dw.com.projectmanager.domain.Member;
import dw.com.projectmanager.dto.MemberDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    @Mapping(target = "id", ignore = true)
    Member toEntity(MemberDTO memberDTO);

    MemberDTO toDTO(Member member);
}

