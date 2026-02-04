package uk.ac.ucl.comp0010.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;
import uk.ac.ucl.comp0010.entity.Registration;
import uk.ac.ucl.comp0010.vo.RegistrationListVo;
import uk.ac.ucl.comp0010.vo.StudentRegistrationListVo;


/**
 * <p>
 * Mapper Interface for Table Registration.
 * </p>
 *
 */
public interface RegistrationMapper extends BaseMapper<Registration> {

  IPage<RegistrationListVo> list(IPage<RegistrationListVo> ipage,
      @Param(Constants.WRAPPER) QueryWrapper<RegistrationListVo> wrapper);

  IPage<StudentRegistrationListVo> listStudentRegistrations(IPage<StudentRegistrationListVo> ipage,
      Integer studentId);
}
