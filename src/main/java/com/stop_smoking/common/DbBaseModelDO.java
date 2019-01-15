package com.stop_smoking.common;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p>关系型数据库基础实体类</p>
 * @author zengdegui
 * @date 2018年9月1日
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class DbBaseModelDO<T extends Model<T>> extends DbBaseColumnDO<T> {

	private static final long serialVersionUID = -407100883907464557L;

	@NotBlank(message = "{id.notBlank}")
	@ApiModelProperty(value = "每个表唯一主键，添加时不用填写，编辑时必填")
	@TableId
	protected String id;

	public void setId(String id) {
		this.id = StringUtils.trimToNull(id);
	}

	/**
	 * 设置主键
	 */
	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
