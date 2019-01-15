package com.stop_smoking.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <p>关系型数据库基础通用列实体类</p>
 * @author zengdegui
 * @date 2018年9月1日
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class DbBaseColumnDO<T extends Model<T>> extends Model<T> {

	private static final long serialVersionUID = 6082828120669040748L;

	@ApiModelProperty(value = "创建时间（不用填写）", hidden = true)
	@TableField(fill = FieldFill.INSERT)
	protected Date gmtCreate;

	@ApiModelProperty(value = "创建人（不用填写）", hidden = true)
	@TableField(fill = FieldFill.INSERT)
	protected String createBy;

	@ApiModelProperty(value = "更新时间（不用填写）", hidden = true)
	@TableField(fill = FieldFill.INSERT_UPDATE)
	protected Date gmtModified;

	@ApiModelProperty(value = "更新人（不用填写）", hidden = true)
	@TableField(fill = FieldFill.UPDATE)
	protected String modifiedBy;

	@ApiModelProperty(value = "删除标记（0：未删除，1：已删除）（不用填写）", hidden = true)
	@TableField(fill = FieldFill.INSERT)
    @TableLogic
    protected Boolean flagDelete;

	@NotNull(message = "{version.notNull}")
	@ApiModelProperty(value = "乐观锁，添加时不用填写，编辑时必填")
	@TableField(fill = FieldFill.INSERT)
	@Version
	protected Integer version;

}
