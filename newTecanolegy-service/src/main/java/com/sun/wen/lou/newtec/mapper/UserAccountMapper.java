package com.sun.wen.lou.newtec.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sun.wen.lou.newtec.dto.UserAccountDTO;
import com.sun.wen.lou.newtec.entity.UserAccount;

public interface UserAccountMapper {

	public int save(UserAccountDTO UserAccount);

	public int update(UserAccountDTO UserAccount);

	public UserAccountDTO queryById(String UserAccountId);

	public List<UserAccountDTO> queryList(@Param("page") PageController page,
			@Param("UserAccountDTO") UserAccountDTO UserAccountDTO);

	public int deleteByIds(List<String> ids);

	public void updateSts(UserAccountDTO UserAccount);

	public List<UserAccount> queryListAll();
	public List<UserAccount> queryListForCommon(@Param("uucid") String uucid);

}
